package net.mrfrayon.frayonores.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.mrfrayon.frayonores.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class Uranium extends Item {
    public Uranium(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {

        Player player = pContext.getPlayer();

        if(player.isHolding(ModItems.URANIUM.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 2, 20));
            player.addEffect(new MobEffectInstance(MobEffects.WITHER, 1, 10));
            player.addEffect(new MobEffectInstance(MobEffects.POISON, 3, 15));

        } else if (player.getArmorValue() > 0) {
            player.removeAllEffects();
        }

        return super.useOn(pContext);
    }

    @Override
    public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> p_41423_, TooltipFlag p_41424_) {
        if(Screen.hasControlDown()) {
            p_41423_.add(Component.translatable("Wear Armor to not get \n any damage"));
        } else {
            p_41423_.add(Component.translatable("§&Press ctrl to more info."));
        }
    }
}
