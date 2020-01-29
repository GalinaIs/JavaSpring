package com.sbrf.galina;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing music on '" + name + "' : " + music.getSong() + " in volume " + volume);
    }
}
