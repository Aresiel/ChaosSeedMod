package dev.aresiel.chaosseed.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import dev.aresiel.chaosseed.ChaosSeed;
import net.minecraft.server.level.WorldGenRegion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(WorldGenRegion.class)
public class WorldgenRegion {

    @ModifyReturnValue(
            method = "getSeed()J",
            at = @At("RETURN")
    )
    public long seed(long original) {
        return ChaosSeed.randomSeed();
    }
}
