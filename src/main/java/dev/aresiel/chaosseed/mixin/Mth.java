package dev.aresiel.chaosseed.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import dev.aresiel.chaosseed.ChaosSeed;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(net.minecraft.util.Mth.class)
public class Mth {

    @ModifyReturnValue(
            method = "getSeed(III)J",
            at = @At("RETURN")
    )
    private static long seed(long original) {
        return ChaosSeed.randomSeed();
    }
}
