package xxrexraptorxx.lexicon.main;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.lexicon.utils.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://www.curseforge.com/minecraft/mc-mods/lexicon
 **/
@Mod(References.MODID)
public class Lexicon {

    public static final Logger LOGGER = LogManager.getLogger();

    public Lexicon() {
        Config.init();
    }

}