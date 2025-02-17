package com.bettercarrots.item.client;

import com.bettercarrots.item.custom.RilyniumFireArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RilyniumFireArmorRenderer extends GeoArmorRenderer<RilyniumFireArmorItem> {
    public RilyniumFireArmorRenderer() {
        super(new RilyniumFireArmorModel());
    }
}
