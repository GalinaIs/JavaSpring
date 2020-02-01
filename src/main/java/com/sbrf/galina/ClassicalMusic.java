package com.sbrf.galina;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

@Component
@Scope
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

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
