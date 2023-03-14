package xxrexraptorxx.lexicon.main.common.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import xxrexraptorxx.lexicon.main.common.util.ModStrings;

public class ModItems {

  public static final ItemStack CERTIFICATE_REWARD  = new ItemStack(Items.PAPER).setHoverName(
      ModStrings.CERTIFICATE_REWARD_NAME);
  public static final ItemStack PLAYER_HEAD_REWARD  = new ItemStack(Items.PLAYER_HEAD);
  public static final ItemStack DIAMON_SWORD_REWARD = new ItemStack(Items.DIAMOND_SWORD, 1).setHoverName(
      ModStrings.SWORD_REWARD_NAME);
  public static final ItemStack ELITE_STAR_REWARD   = new ItemStack(Items.NETHER_STAR).setHoverName(
      ModStrings.ELITE_STAR_REWARD_NAME);

  private ModItems() {}

}
