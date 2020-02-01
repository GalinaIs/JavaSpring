package com.sbrf.galina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private final Music music1;
    private final Music music2;
    private final Random random;

    @Autowired
    public MusicPlayer(@Qualifier("someRockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
        this.random = new Random();
    }

    public String playMusic(MusicType musicType) {
        String song;
        if (musicType == MusicType.CLASSICAL) {
            song = music2.getSongs().get(getRandomValueFrom0To2());
        } else {
            song = music1.getSongs().get(getRandomValueFrom0To2());
        }
        return "Playing music : " + song;
    }

    private int getRandomValueFrom0To2() {
        return random.nextInt(3);
    }
}
