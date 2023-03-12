package xxrexraptorxx.lexicon.main.fabric.init;

import net.minecraftforge.api.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig.Type;
import xxrexraptorxx.lexicon.main.common.config.ModConfig;
import xxrexraptorxx.lexicon.main.common.util.ModReferences;

public class ModConfigInitFabric {

  public static void init() {
    ModLoadingContext.registerConfig(ModReferences.MOD_ID, Type.CLIENT, ModConfig.CLIENT_SPEC);
    ModLoadingContext.registerConfig(ModReferences.MOD_ID, Type.SERVER, ModConfig.SERVER_SPEC);
  }
}
