package net.craftycram.timoliaadventskalenderaddon.events;

import net.labymod.api.event.Subscribe;
import net.labymod.api.event.events.client.TickEvent;
import net.labymod.api.event.events.client.input.MouseInputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class TickEventListener {

    boolean featherExisted;

    @Subscribe
    public void onTick(TickEvent event) {
        ClientPlayerEntity player = Minecraft.getInstance().player;
        if (player == null) return;
        ItemStack reset = player.inventory.getStackInSlot(0);
        if (reset.isEmpty() || reset.getItem() != Items.RED_DYE) return;
        ItemStack feather = player.inventory.getStackInSlot(2);
        boolean featherExists = feather.getItem() == Items.FEATHER;

        if (featherExists != featherExisted) {
            if (featherExists) player.inventory.currentItem = 2;
            else player.inventory.currentItem = 0;
            featherExisted = featherExists;
        }

    }

}
