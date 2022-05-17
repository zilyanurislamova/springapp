package org.example.springcourse.lesson8;

import org.example.springcourse.lesson4.IndieMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInitDestroyFactory {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IndieMusic indieMusic = context.getBean("musicBean1", IndieMusic.class);

        IndieMusic indieMusic1 = context.getBean("musicBean1", IndieMusic.class);

        System.out.println(indieMusic.getSong());

        context.close();
    }
}
