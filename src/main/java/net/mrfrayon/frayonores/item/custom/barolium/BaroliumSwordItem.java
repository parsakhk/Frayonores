package net.mrfrayon.frayonores.item.custom.barolium;

import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.phys.Vec3;

public class BaroliumSwordItem extends SwordItem {

    public BaroliumSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public boolean hurtEnemy(ItemStack p_43278_, LivingEntity Enemy, LivingEntity Player) {
        if (Player.getArmorValue() > 0) {
            // for 3 seconds we want to hurt him with poision
            Enemy.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 2), Player);

            // freeze the mob
            if(!Enemy.level.isClientSide() || !Player.level.isClientSide()) {
                Double x = Enemy.getX();
                Double y = Enemy.getY();
                Double z = Enemy.getZ();

                Enemy.teleportTo(x, y, z);
                Enemy.setDeltaMovement(0, 0, 0);
            }
            return super.hurtEnemy(p_43278_, Enemy, Player);
        }
        else {
            return Player.acceptsFailure();
        }
    }
}
