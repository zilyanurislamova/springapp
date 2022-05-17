package org.example.springcourse.lesson7;

import org.example.springcourse.lesson4.MusicPlayer;
import org.example.springcourse.lesson4.RockMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSingletonVsPrototype {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = musicPlayer1 == musicPlayer2;

        System.out.println(comparison);

        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);

        musicPlayer2.setMusic(new RockMusic());

        musicPlayer1.playMusic();
        musicPlayer2.playMusic();

        context.close();
    }
}
