package dev.aresiel.chaosseed.mixin;

import dev.aresiel.chaosseed.ChaosSeed;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(net.minecraft.world.level.biome.BiomeManager.class)
public class BiomeManager {

    @ModifyArg(method = "getBiome", at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/level/biome/BiomeManager;getFiddledDistance(JIIIDDD)D"),
            index = 0
    )
    public long getBiomeSeed(long original){
        return ChaosSeed.randomSeed();
    }
}
