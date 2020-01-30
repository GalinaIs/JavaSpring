package com.sbrf.galina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    private RockMusic rockMusic;
    @Autowired
    private ClassicalMusic classicalMusic;
    private String name;
    private int volume;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic() {
         return "Playing music on '" + name + "' : " + rockMusic.getSong() + " "  +
                classicalMusic.getSong() + " in volume " + volume;
    }
}
