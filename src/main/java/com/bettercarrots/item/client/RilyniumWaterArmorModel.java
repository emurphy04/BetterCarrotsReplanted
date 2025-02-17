package com.bettercarrots.item.client;


import com.bettercarrots.Bettercarrotsreplanted;
import com.bettercarrots.item.custom.RilyniumWaterArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class RilyniumWaterArmorModel extends GeoModel<RilyniumWaterArmorItem> {

    @Override
    public Identifier getModelResource(RilyniumWaterArmorItem rilyniumWaterArmorItem) {
        return new Identifier(Bettercarrotsreplanted.MOD_ID, "geo/rilynium_water_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(RilyniumWaterArmorItem rilyniumWaterArmorItem) {
        return new Identifier(Bettercarrotsreplanted.MOD_ID, "textures/armor/rilynium_water_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(RilyniumWaterArmorItem rilyniumWaterArmorItem) {
        return new Identifier(Bettercarrotsreplanted.MOD_ID, "animations/rilynium_water_armor.animation.json");
    }
}
