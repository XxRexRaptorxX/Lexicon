package xxrexraptorxx.lexicon.main.forge.event;

import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.VersionChecker;
import net.minecraftforge.fml.VersionChecker.Status;
import net.minecraftforge.fml.common.Mod;
import xxrexraptorxx.lexicon.main.common.config.ModConfig;
import xxrexraptorxx.lexicon.main.common.event.ModEvents;
import xxrexraptorxx.lexicon.main.common.util.LoggerUtils;
import xxrexraptorxx.lexicon.main.common.util.ModReferences;
import xxrexraptorxx.lexicon.main.common.util.ModStrings;
import xxrexraptorxx.lexicon.main.common.util.ModUtils;

@Mod.EventBusSubscriber(modid = ModReferences.MOD_ID)
public class ModEventsForge {

  private static boolean hasShownUp = false;

  private ModEventsForge() {}

  /**
   * Give Lexicon on first join
   */
  @SubscribeEvent
  public static void giveBookOnFirstJoin(PlayerLoggedInEvent event) {
    ModEvents.giveBookOnFirstJoin(ModUtils.getServerPlayer(Objects.requireNonNull(event.getEntity())));
  }

  /**
   * Update checker
   **/
  @SubscribeEvent
  public static void updateChecker(TickEvent.ClientTickEvent event) {
    if (ModConfig.CLIENT_CONFIG.UPDATE_CHECKER.get()) {
      if (!hasShownUp && Minecraft.getInstance().screen == null) {
        Status VERSION_STATUS = VersionChecker.getResult(ModList.get().getModContainerById(ModReferences.MOD_ID).get()
                                                                .getModInfo()).status();
        if (VERSION_STATUS == Status.OUTDATED || VERSION_STATUS == Status.BETA_OUTDATED) {
          assert Minecraft.getInstance().player != null;
          Minecraft.getInstance().player.displayClientMessage(ModStrings.UPDATE_AVAILABLE, false);
          Minecraft.getInstance().player.displayClientMessage(ModStrings.MOD_PAGE, false);
          hasShownUp = true;
        } else if (VERSION_STATUS == VersionChecker.Status.FAILED) {
          LoggerUtils.LOGGER.error(ModReferences.MOD_NAME + "'s version checker failed!");
          hasShownUp = true;
        }
      }
    }
  }

  /** Distributes the supporter rewards on first join. */
  @SubscribeEvent
  public static void supporterRewards(PlayerLoggedInEvent event) {
    ServerPlayer serverPlayer = ModUtils.getServerPlayer(Objects.requireNonNull(event.getEntity()));
    ModEvents.supporterRewards(serverPlayer);
  }
}
