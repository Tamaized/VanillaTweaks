package io.github.strikerrocker.vt.compat.baubles;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraftforge.fml.ModList;

public class BaubleTools {
    private BaubleTools() {
    }

    public static boolean hasProbeGoggle(PlayerEntity player) {
        if (ModList.get().isLoaded("baubles")) {
            /*IBaublesItemHandler handler = BaublesApi.getBaublesHandler(player);
            if (handler == null) {
                return false;
            }
            ItemStack stackInSlot = handler.getStackInSlot(4);
            return !stackInSlot.isEmpty() && stackInSlot.getItem() instanceof ItemBaubleBino;
        } else {
            return false;*/
        }
        return false;
    }

    public static Item initBinocularBauble() {
        return new ItemBaubleBino();
    }
}