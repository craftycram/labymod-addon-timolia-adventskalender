package net.craftycram.timoliaadventskalenderaddon;

import net.labymod.addon.AddonTransformer;
import net.labymod.api.TransformerType;

public class TimoliaAdventskalenderAddonTransformer extends AddonTransformer {

  @Override
  public void registerTransformers() {
    this.registerTransformer(TransformerType.VANILLA, "example.mixin.json");
  }
}
