package com.bettercarrots.item.client;


import com.bettercarrots.Bettercarrotsreplanted;
import com.bettercarrots.item.custom.RilyniumArmorItem;
import com.bettercarrots.item.custom.RilyniumElectricArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class RilyniumElectricArmorModel extends GeoModel<RilyniumElectricArmorItem> {

    @Override
    public Identifier getModelResource(RilyniumElectricArmorItem rilyniumElectricArmorItem) {
        return new Identifier(Bettercarrotsreplanted.MOD_ID, "geo/rilynium_electric_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(RilyniumElectricArmorItem rilyniumElectricArmorItem) {
        return new Identifier(Bettercarrotsreplanted.MOD_ID, "textures/armor/rilynium_electric_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(RilyniumElectricArmorItem rilyniumElectricArmorItem) {
        return new Identifier(Bettercarrotsreplanted.MOD_ID, "animations/rilynium_electric_armor.animation.json");
    }
}
