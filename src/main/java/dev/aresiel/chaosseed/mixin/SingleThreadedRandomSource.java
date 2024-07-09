package dev.aresiel.chaosseed.mixin;

import dev.aresiel.chaosseed.ChaosSeed;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(net.minecraft.world.level.levelgen.SingleThreadedRandomSource.class)
public class SingleThreadedRandomSource {

    @ModifyVariable(method = "setSeed", at = @At("HEAD"), argsOnly = true)
    public long setSeed(long seed) {
        return ChaosSeed.randomSeed();
    }
}
