package xxrexraptorxx.lexicon.main.common.event;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import vazkii.patchouli.api.PatchouliAPI;
import xxrexraptorxx.lexicon.main.common.config.ModConfig;
import xxrexraptorxx.lexicon.main.common.config.ModConfig.ServerConfig;
import xxrexraptorxx.lexicon.main.common.item.ModItems;
import xxrexraptorxx.lexicon.main.common.util.LoggerUtils;
import xxrexraptorxx.lexicon.main.common.util.ModReferences;

public class ModEvents {

  private static final ResourceLocation LEXICON_BOOK = new ResourceLocation(ModReferences.MOD_ID, ModReferences.MOD_ID);
  private ModEvents() {}
  /** Give Lexicon on first join */
  public static void giveBookOnFirstJoin(ServerPlayer player) {
    int playTime = player.getStats().getValue(Stats.CUSTOM, Stats.PLAY_TIME);

    if (!(playTime > 0) && ModConfig.CLIENT_CONFIG.GIVE_LEXICON_ON_FIRST_JOIN.get()) {
      player.addItem(PatchouliAPI.get().getBookStack(LEXICON_BOOK));
    }
  }

  /** Distributes the supporter rewards on first join. */
  public static void supporterRewards(ServerPlayer player) {
    if (ServerConfig.PATREON_REWARDS.get()) {
      try {
        URL URL_SUPPORTER = new URL(ModReferences.SUPPORTERS.SUPPORTER);
        URL URL_PREMIUM   = new URL(ModReferences.SUPPORTERS.PREMIUM);
        URL URL_ELITE     = new URL(ModReferences.SUPPORTERS.ELITE);

        // Check if player already has rewards
        if (!player.getInventory().contains(new ItemStack(Items.PAPER))) {
          // Check if player joins the first time
          if (player.getStats().getValue(Stats.CUSTOM, Stats.PLAY_TIME) < 5) {
            // Check if player is supporter
            if (supporterCheck(URL_SUPPORTER, player)) {
              ItemStack   PLAYER_HEAD_REWARD = ModItems.PLAYER_HEAD_REWARD;
              CompoundTag ownerNBT           = new CompoundTag();
              ownerNBT.putString("SkullOwner", player.getName().getString());
              PLAYER_HEAD_REWARD.setTag(ownerNBT);

              player.getLevel().playSound(null, player.blockPosition(), SoundEvents.PLAYER_LEVELUP, SoundSource.PLAYERS,
                                          0.5F, player.getLevel().random.nextFloat() * 0.15F + 0.8F);
              player.addItem(PLAYER_HEAD_REWARD);
              player.addItem(ModItems.CERTIFICATE_REWARD);
            } // Check if player is premium supporter
            else if (supporterCheck(URL_PREMIUM, player)) {
              ItemStack PREMIUM_REWARD = ModItems.DIAMON_SWORD_REWARD;
              PREMIUM_REWARD.enchant(Enchantments.MENDING, 1);
              PREMIUM_REWARD.enchant(Enchantments.SHARPNESS, 3);

              player.addItem(PREMIUM_REWARD);
            } // Check if player is elite supporter
            else if (supporterCheck(URL_ELITE, player)) {
              player.addItem(ModItems.ELITE_STAR_REWARD);
            }
          }
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * Tests if a player is a supporter
   *
   * @param url    url to a file that contains the supporter names
   * @param player ingame player
   * @return true/false
   */
  private static boolean supporterCheck(URL url, Player player) {
    try {
      Scanner      scanner       = new Scanner(url.openStream());
      List<String> supporterList = scanner.tokens().toList();

      for (String name : supporterList) {
        // Check if player is in supporter list
        if (player.getName().getString().equals(name)) {
          return true;
        }
      }
      scanner.close();
    } catch (MalformedURLException e) {
      LoggerUtils.LOGGER.error("Supporter list URL not found! >>" + url);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return true;
  }
}
