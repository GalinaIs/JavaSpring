package com.sbrf.galina;

public class ClassicalMusic implements Music {
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
