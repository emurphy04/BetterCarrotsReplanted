package com.bettercarrots.item.client;

import com.bettercarrots.item.custom.RilyniumWaterArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RilyniumWaterArmorRenderer extends GeoArmorRenderer<RilyniumWaterArmorItem> {
    public RilyniumWaterArmorRenderer() {
        super(new RilyniumWaterArmorModel());
    }
}
