package xxrexraptorxx.lexicon.main;

import guideme.Guides;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.magmacore.main.ModRegistry;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage <a href="https://www.curseforge.com/minecraft/mc-mods/lexicon">...</a>
 **/
@Mod(References.MODID)
public class Lexicon {

    public static final Logger LOGGER = LogManager.getLogger();

    public Lexicon(IEventBus bus, ModContainer container) {
        bus.addListener(this::addCreative);

        ModRegistry.register(References.MODID, References.NAME, References.URL);
    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> key = event.getTabKey();

        if (key == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            if (ModList.get().isLoaded("guideme")) {
                event.accept(Guides.createGuideItem(ResourceLocation.fromNamespaceAndPath(References.MODID, "lexicon")));
            }
        }
    }

}
