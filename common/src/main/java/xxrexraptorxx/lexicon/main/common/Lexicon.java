package xxrexraptorxx.lexicon.main.common;

import xxrexraptorxx.lexicon.main.common.util.LoggerUtils;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://github.com/XxRexRaptorxX/Lexicon
 **/
public interface Lexicon {

  default void setup() {
    LoggerUtils.init();
  }
}
