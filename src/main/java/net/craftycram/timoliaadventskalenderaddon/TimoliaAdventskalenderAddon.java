package net.craftycram.timoliaadventskalenderaddon;

import java.util.List;

import net.craftycram.timoliaadventskalenderaddon.events.TickEventListener;
import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.BooleanElement;
import net.labymod.settings.elements.ControlElement.IconData;
import net.labymod.settings.elements.SettingsElement;
import net.labymod.utils.Material;

public class TimoliaAdventskalenderAddon extends LabyModAddon {

  @Override
  public void onEnable() {
    getApi().getEventService().registerListener(new TickEventListener());
  }

  @Override
  public void loadConfig() {

  }

  @Override
  protected void fillSettings(List<SettingsElement> list) {
    list.add(new BooleanElement("test", new IconData(Material.ACACIA_FENCE)));
  }
}
