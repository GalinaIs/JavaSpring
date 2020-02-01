package com.sbrf.galina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Autowired
    private MusicPlayer musicPlayer;
    private int id = 1;

    @Override
    public String toString() {
        return "Computer{" +
                "musicPlayer=" + musicPlayer.playMusic(MusicType.CLASSICAL) +
                ", id=" + id +
                '}';
    }
}
