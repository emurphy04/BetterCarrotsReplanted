package com.bettercarrots.item.client;

import com.bettercarrots.Bettercarrotsreplanted;
import com.bettercarrots.item.custom.RilyniumArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RilyniumArmorRenderer extends GeoArmorRenderer<RilyniumArmorItem> {
    public RilyniumArmorRenderer() {
        super(new DefaultedItemGeoModel<>(Identifier.of(Bettercarrotsreplanted.MOD_ID, "geo/rilynium_armor.geo.json")));
    }
}