package com.bettercarrots.item.client;


import com.bettercarrots.Bettercarrotsreplanted;
import com.bettercarrots.item.custom.RilyniumFireArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class RilyniumFireArmorModel extends GeoModel<RilyniumFireArmorItem> {

    @Override
    public Identifier getModelResource(RilyniumFireArmorItem rilyniumFireArmorItem) {
        return new Identifier(Bettercarrotsreplanted.MOD_ID, "geo/rilynium_fire_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(RilyniumFireArmorItem rilyniumFireArmorItem) {
        return new Identifier(Bettercarrotsreplanted.MOD_ID, "textures/armor/rilynium_fire_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(RilyniumFireArmorItem rilyniumFireArmorItem) {
        return new Identifier(Bettercarrotsreplanted.MOD_ID, "animations/rilynium_fire_armor.animation.json");
    }
}
