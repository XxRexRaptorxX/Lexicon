package xxrexraptorxx.lexicon.main.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtils {

  public static final Logger LOGGER = LoggerFactory.getLogger(ModReferences.MOD_NAME);
  private LoggerUtils() {}

  public static void init() {
    LOGGER.info(ModReferences.MOD_NAME + " initialized");
  }
}
