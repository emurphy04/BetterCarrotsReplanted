package com.bettercarrots.item.client;


import com.bettercarrots.Bettercarrotsreplanted;
import com.bettercarrots.item.custom.RilyniumWindArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class RilyniumWindArmorModel extends GeoModel<RilyniumWindArmorItem> {

    @Override
    public Identifier getModelResource(RilyniumWindArmorItem rilyniumWindArmorItem) {
        return new Identifier(Bettercarrotsreplanted.MOD_ID, "geo/rilynium_wind_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(RilyniumWindArmorItem rilyniumWindArmorItem) {
        return new Identifier(Bettercarrotsreplanted.MOD_ID, "textures/armor/rilynium_wind_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(RilyniumWindArmorItem rilyniumWindArmorItem) {
        return new Identifier(Bettercarrotsreplanted.MOD_ID, "animations/rilynium_wind_armor.animation.json");
    }
}
