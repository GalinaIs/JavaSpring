package com.sbrf.galina;

import org.springframework.beans.factory.annotation.Autowired;

public class Computer {
    private MusicPlayer musicPlayer;
    private int id = 1;

    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "musicPlayer=" + musicPlayer.playMusic(MusicType.CLASSICAL) +
                ", id=" + id +
                '}';
    }
}
