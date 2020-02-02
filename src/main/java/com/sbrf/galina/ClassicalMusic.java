package com.sbrf.galina;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("do init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("do destroy");
    }

    @Override
    public List<String> getSongs() {
        return Arrays.asList("classical song1", "classical song2", "classical song3");
    }
}
