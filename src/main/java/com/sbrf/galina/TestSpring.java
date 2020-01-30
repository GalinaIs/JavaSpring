package com.sbrf.galina;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();*/

        /*MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(firstMusicPlayer == secondMusicPlayer);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);*/
        //musicPlayer.playMusic();

        /*ClassicalMusic music = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(music.getSong());
        ClassicalMusic music1 = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(music == music1);*/

        /*Music music = context.getBean("someRockMusic", Music.class);
        System.out.println(music.getSong());
        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        System.out.println(classicalMusic.getSong());*/

        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
