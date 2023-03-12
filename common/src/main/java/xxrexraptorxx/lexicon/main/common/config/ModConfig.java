package xxrexraptorxx.lexicon.main.common.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class ModConfig {

  public static final String          CATEGORY_GENERAL = "general";
  public static final ForgeConfigSpec CLIENT_SPEC;
  public static final ForgeConfigSpec SERVER_SPEC;
  public static       ClientConfig    CLIENT_CONFIG;
  public static       ServerConfig    SERVER_CONFIG;


  static {
    final Pair<ClientConfig, ForgeConfigSpec> clientSpecPair = new ForgeConfigSpec.Builder().configure(ClientConfig::new);
    CLIENT_SPEC   = clientSpecPair.getRight();
    CLIENT_CONFIG = clientSpecPair.getLeft();

    final Pair<ServerConfig, ForgeConfigSpec> serverSpecPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
    SERVER_SPEC   = serverSpecPair.getRight();
    SERVER_CONFIG = serverSpecPair.getLeft();
  }


  public static class ClientConfig {

    public final ForgeConfigSpec.BooleanValue GIVE_LEXICON_ON_FIRST_JOIN;
    public final ForgeConfigSpec.BooleanValue UPDATE_CHECKER;

    ClientConfig(ForgeConfigSpec.Builder builder) {
      builder.comment("General").push(CATEGORY_GENERAL);
      GIVE_LEXICON_ON_FIRST_JOIN = builder.comment("Give Lexicon book on first join").define("give_book", true);
      UPDATE_CHECKER             = builder.comment("Activate the update checker").define("update_checker", true);
      builder.pop();
    }
  }

  public static class ServerConfig {

    public static ForgeConfigSpec.BooleanValue PATREON_REWARDS;

    ServerConfig(ForgeConfigSpec.Builder builder) {
      builder.comment("General").push(CATEGORY_GENERAL);
      PATREON_REWARDS = builder.comment("Enables ingame rewards on first spawn for Patreons").define("patreon_rewards", true);
      builder.pop();
    }
  }
}
