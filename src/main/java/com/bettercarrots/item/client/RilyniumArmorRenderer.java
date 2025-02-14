package com.bettercarrots.item.client;

import com.bettercarrots.item.custom.RilyniumArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RilyniumArmorRenderer extends GeoArmorRenderer<RilyniumArmorItem> {
    public RilyniumArmorRenderer() {
        super(new RilyniumArmorModel());
    }
}
