package xxrexraptorxx.lexicon.main;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.lexicon.utils.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage <a href="https://www.curseforge.com/minecraft/mc-mods/lexicon">...</a>
 **/
@Mod(References.MODID)
public class Lexicon {

    public static final Logger LOGGER = LogManager.getLogger();

    public Lexicon(ModContainer container) {
        Config.init(container);
    }

}