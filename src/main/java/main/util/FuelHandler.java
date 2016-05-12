package main.util;

import main.ZTiC;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import org.apache.commons.lang3.RandomUtils;

public class FuelHandler implements IFuelHandler {

    @Override
    public int getBurnTime(ItemStack fuel) {
        if (fuel.getItem().equals(ZTiC.lignite)) {
            return 200 * 2;
        }
        if (fuel.getItem().equals(ZTiC.fuel_brick)) {
            return RandomUtils.nextInt(1, RandomUtils.nextInt(1, RandomUtils.nextInt(1, 64))) * 200;
        }
        return 0;
    }

}
