package xxrexraptorxx.lexicon.main.forge;

import net.minecraftforge.fml.common.Mod;
import xxrexraptorxx.lexicon.main.common.Lexicon;
import xxrexraptorxx.lexicon.main.common.util.ModReferences;
import xxrexraptorxx.lexicon.main.forge.init.ModConfigInitForge;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://github.com/XxRexRaptorxX/Lexicon
 **/
@Mod(ModReferences.MOD_ID)
public final class LexiconForge implements Lexicon {

  public LexiconForge() {
    ModConfigInitForge.init();
    setup();
  }
}
