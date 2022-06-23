package xxrexraptorxx.lexicon.utils;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.VersionChecker;
import net.minecraftforge.fml.common.Mod;
import xxrexraptorxx.lexicon.main.Lexicon;
import xxrexraptorxx.lexicon.main.References;

@Mod.EventBusSubscriber(modid = References.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Events {


    /** Update-Checker **/
    private static boolean hasShownUp = false;

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (Config.UPDATE_CHECKER.get()) {
            if (!hasShownUp && Minecraft.getInstance().screen == null) {
                if (VersionChecker.getResult(ModList.get().getModContainerById(References.MODID).get().getModInfo()).status() == VersionChecker.Status.OUTDATED ||
                        VersionChecker.getResult(ModList.get().getModContainerById(References.MODID).get().getModInfo()).status() == VersionChecker.Status.BETA_OUTDATED ) {

                    Minecraft.getInstance().player.sendSystemMessage(Component.literal(ChatFormatting.BLUE + "A newer version of " + ChatFormatting.YELLOW + References.NAME + ChatFormatting.BLUE + " is available!"));
                    Minecraft.getInstance().player.sendSystemMessage(Component.literal(ChatFormatting.GRAY + References.URL));

                    hasShownUp = true;

                } else if (VersionChecker.getResult(ModList.get().getModContainerById(References.MODID).get().getModInfo()).status() == VersionChecker.Status.FAILED) {
                    Lexicon.LOGGER.error(References.NAME + "'s version checker failed!");
                    hasShownUp = true;

                }
            }
        }
    }


    private static final String SUPPORTER_URL = "https://raw.githubusercontent.com/XxRexRaptorxX/Patreons/main/Supporter";
    private static final String PREMIUM_SUPPORTER_URL = "https://raw.githubusercontent.com/XxRexRaptorxX/Patreons/main/Premium%20Supporter";
    private static final String ELITE_URL = "https://raw.githubusercontent.com/XxRexRaptorxX/Patreons/main/Elite";
    private static boolean supporter = false;
/**         TODO Patreon rewards
    public static void checkForUpdates() {
        new Thread("Update-Checker") {

            public void run() {
                try {
                    URL url = new URL(SUPPORTER_URL);
                    Scanner scanner = new Scanner(url.openStream());

                    while (scanner.hasNextLine()) {
                        System.err.println(scanner.nextLine()); //TEST

                        if (Minecraft.getInstance().player.getName().getString() == (scanner.nextLine())) {
                            supporter = true;
                            //DO STUFF
                        }
                    }
                    scanner.close();

                } catch (MalformedURLException e) {
                    Lexicon.LOGGER.error("Supporter-URL not found!" );

                } catch (IOException e) {
                    e.printStackTrace();
                }
            };

        }.start();

    }

    @SubscribeEvent
    public static void SupporterRewards(PlayerEvent.PlayerLoggedInEvent event) {
        try {
            URL url = new URL(SUPPORTER_URL);
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNextLine()) {
                System.err.println(scanner.nextLine()); //TEST

                if (event.getPlayer().getName().getString() == scanner.nextLine()) {
                    supporter = true;
                    //DO STUFF
                    System.err.println("!!!!!!"); //TEST

                }
            }
            scanner.close();

        } catch (MalformedURLException e) {
            Lexicon.LOGGER.error("Supporter-URL not found!" );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
**/

}
