package com.sbrf.galina;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("do init");
    }

    public void doMyDestroy() {
        System.out.println("do destroy");
    }

    @Override
    public List<String> getSongs() {
        return Arrays.asList("classical song1", "classical song2", "classical song3");
    }
}
