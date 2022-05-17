package org.example.springcourse.lesson11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextForAnnotations.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic(MusicStyle.INDIE)); // HW

        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume()); //DI using @Value and external file

        IndieMusic indieMusic1 = context.getBean("indieMusic", IndieMusic.class); //one init+one destroy if scope=singleton
        IndieMusic indieMusic2 = context.getBean("indieMusic", IndieMusic.class); //two init+one init from player if scope=prototype

        System.out.println(indieMusic1 == indieMusic2); //false if scope=prototype

        context.close();
    }
}
