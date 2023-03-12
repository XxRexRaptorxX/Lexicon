package xxrexraptorxx.lexicon.main.fabric;

import net.fabricmc.api.ModInitializer;
import xxrexraptorxx.lexicon.main.common.Lexicon;
import xxrexraptorxx.lexicon.main.fabric.init.ModConfigInitFabric;
import xxrexraptorxx.lexicon.main.fabric.init.ModEventInitFabric;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://github.com/XxRexRaptorxX/Lexicon
 **/
public final class LexiconFabric implements Lexicon, ModInitializer {

  @Override
  public void onInitialize() {
    ModConfigInitFabric.init();
    ModEventInitFabric.init();
    setup();
  }
}
