package dev.aresiel.chaosseed.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import dev.aresiel.chaosseed.ChaosSeed;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(net.minecraft.world.level.levelgen.WorldOptions.class)
public abstract class WorldOptions {

    @ModifyReturnValue(
            method = "seed()J",
            at = @At("RETURN")
    )
    public long seed(long original) {
        return ChaosSeed.randomSeed();
    }
}
