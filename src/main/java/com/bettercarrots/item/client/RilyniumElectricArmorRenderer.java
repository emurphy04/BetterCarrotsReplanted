package com.bettercarrots.item.client;

import com.bettercarrots.item.custom.RilyniumArmorItem;
import com.bettercarrots.item.custom.RilyniumElectricArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RilyniumElectricArmorRenderer extends GeoArmorRenderer<RilyniumElectricArmorItem> {
    public RilyniumElectricArmorRenderer() {
        super(new RilyniumElectricArmorModel());
    }
}
