package com.bettercarrots.item.client;


import com.bettercarrots.Bettercarrotsreplanted;
import com.bettercarrots.item.custom.RilyniumArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class RilyniumArmorModel extends GeoModel<RilyniumArmorItem> {

    @Override
    public Identifier getModelResource(RilyniumArmorItem rilyniumArmorItem) {
        return Identifier.of(Bettercarrotsreplanted.MOD_ID, "geo/rilynium_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(RilyniumArmorItem rilyniumArmorItem) {
        return Identifier.of(Bettercarrotsreplanted.MOD_ID, "textures/armor/rilynium_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(RilyniumArmorItem rilyniumArmorItem) {
        return Identifier.of(Bettercarrotsreplanted.MOD_ID, "animations/rilynium_armor.animation.json");
    }
}