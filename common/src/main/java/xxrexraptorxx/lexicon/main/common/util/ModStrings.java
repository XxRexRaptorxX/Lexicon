package xxrexraptorxx.lexicon.main.common.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;

public class ModStrings {

  public static final Component CERTIFICATE_REWARD_NAME = Component.literal(
      "%sThank you for supporting me in my work! %s%s- XxRexRaptorxX".formatted(ChatFormatting.GOLD,
                                                                                ChatFormatting.ITALIC,
                                                                                ChatFormatting.GREEN));
  public static final Component SWORD_REWARD_NAME       = Component.literal("Rex's Night Sword").withStyle(
      ChatFormatting.DARK_GRAY);
  public static final Component ELITE_STAR_REWARD_NAME  = Component.literal("Elite Star");
  public static final Component UPDATE_AVAILABLE        = Component.literal(
      "%sA newer version of %s%s%s is available!".formatted(ChatFormatting.BLUE, ChatFormatting.YELLOW,
                                                            ModReferences.MOD_NAME, ChatFormatting.BLUE));
  public static final Component MOD_PAGE                = Component.literal(
      ChatFormatting.GRAY + ModReferences.MOD_PAGE);
}
