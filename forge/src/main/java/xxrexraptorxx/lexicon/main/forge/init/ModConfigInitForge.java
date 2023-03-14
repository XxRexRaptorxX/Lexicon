package xxrexraptorxx.lexicon.main.forge.init;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import xxrexraptorxx.lexicon.main.common.config.ModConfig;

@Mod.EventBusSubscriber
public class ModConfigInitForge {

  public static void init() {
    ModLoadingContext.get().registerConfig(Type.CLIENT, ModConfig.CLIENT_SPEC);
    ModLoadingContext.get().registerConfig(Type.SERVER, ModConfig.SERVER_SPEC);
  }
}
