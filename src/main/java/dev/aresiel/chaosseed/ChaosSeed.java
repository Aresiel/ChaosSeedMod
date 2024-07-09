package dev.aresiel.chaosseed;

import net.minecraft.world.level.levelgen.Xoroshiro128PlusPlus;

public class ChaosSeed {
    private static final Xoroshiro128PlusPlus random = new Xoroshiro128PlusPlus(0, 0);

    public static long randomSeed() {
        return random.nextLong();
    }
}
