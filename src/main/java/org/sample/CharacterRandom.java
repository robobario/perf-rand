package org.sample;

import java.util.SplittableRandom;

public class CharacterRandom {

    private final byte[] mappings;
    private final int size;
    private final SplittableRandom random = new SplittableRandom(0);

    public CharacterRandom(String characters){
        if(characters.length() > 127){
            throw new RuntimeException("we only want to map bytes");
        }
        mappings = new byte[characters.length()];
        size = characters.length();
        int i = 0;
        for (char c : characters.toCharArray()) {
            if(c > 127){
                throw new IllegalArgumentException("that ain't byte worthy");
            }
            mappings[i++] = (byte) c;
        }
    }


    public void nextBytes(byte[] bytes) {
        for (int j = 0; j < bytes.length; ++j) {
            bytes[j] = mappings[random.nextInt(size)];
        }
    }

    public static void main(String[] args) {
        CharacterRandom random = new CharacterRandom("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdef");
        byte[] bytes = new byte[1024];
        random.nextBytes(bytes);
    }
}
