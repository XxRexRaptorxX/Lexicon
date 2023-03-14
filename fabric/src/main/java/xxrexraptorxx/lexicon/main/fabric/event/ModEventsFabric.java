package xxrexraptorxx.lexicon.main.fabric.event;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import xxrexraptorxx.lexicon.main.common.event.ModEvents;

public class ModEventsFabric {

  private ModEventsFabric() {}

  public static class GiveBookOnFirstJoin implements ServerPlayConnectionEvents.Join {

    @Override
    public void onPlayReady(ServerGamePacketListenerImpl handler, PacketSender sender, MinecraftServer server) {
      ModEvents.giveBookOnFirstJoin(handler.player);
    }
  }

  public static class SupporterRewards implements ServerPlayConnectionEvents.Join {

    @Override
    public void onPlayReady(ServerGamePacketListenerImpl handler, PacketSender sender, MinecraftServer server) {
      ModEvents.supporterRewards(handler.player);
    }
  }
}
