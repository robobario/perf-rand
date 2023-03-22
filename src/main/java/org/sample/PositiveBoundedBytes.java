package org.sample;

import java.util.SplittableRandom;

public class PositiveBoundedBytes {

    private final byte[] mappings;
    private final SplittableRandom random = new SplittableRandom(0);

    PositiveBoundedBytes(int bound, int offset){
        if(bound > 256){
            throw new IllegalArgumentException("only working with <256 values");
        }
        if((bound - 1) + offset > 127) {
            throw new IllegalArgumentException("maximum value must be representable with byte");
        }
        mappings = new byte[256];
        int max = 256 - (256 % bound);
        for (int i = 0; i < 256; i++) {
            mappings[i] = i >= max ? -1 : (byte) ((i % bound) + offset);
        }
    }


    public void nextBytes(byte[] bytes) {
        int filled = 0;
        while(filled < bytes.length) {
            long rnd = random.nextLong();
            for (int n = 8; n--> 0 && filled < bytes.length; rnd >>>= Byte.SIZE) {
                byte mapping = mappings[(int) (rnd & 255)];
                if(mapping != -1){
                    bytes[filled++] = mapping;
                }
            }
        }
    }
}
