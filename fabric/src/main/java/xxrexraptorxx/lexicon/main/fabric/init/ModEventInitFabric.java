package xxrexraptorxx.lexicon.main.fabric.init;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import xxrexraptorxx.lexicon.main.fabric.event.ModEventsFabric;

public class ModEventInitFabric {

  public static void init() {
    ServerPlayConnectionEvents.JOIN.register(new ModEventsFabric.GiveBookOnFirstJoin());
    ServerPlayConnectionEvents.JOIN.register(new ModEventsFabric.SupporterRewards());
  }
}
