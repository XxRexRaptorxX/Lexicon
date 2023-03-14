package xxrexraptorxx.lexicon.main.common.util;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;

public class ModUtils {

  public static ServerPlayer getServerPlayer(Player player) {
    ServerPlayer serverPlayer = player.getServer().getPlayerList().getPlayer(player.getUUID());
    return serverPlayer;
  }
}
