package com.sbrf.galina;

import org.springframework.stereotype.Component;

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
    public String getSong() {
        return "classical song";
    }
}
