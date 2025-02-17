package com.bettercarrots.item.client;

import com.bettercarrots.item.custom.RilyniumWindArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RilyniumWindArmorRenderer extends GeoArmorRenderer<RilyniumWindArmorItem> {
    public RilyniumWindArmorRenderer() {
        super(new RilyniumWindArmorModel());
    }
}
