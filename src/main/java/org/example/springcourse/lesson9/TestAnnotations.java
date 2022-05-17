package org.example.springcourse.lesson9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextForAnnotations.xml");

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        context.close();
    }
}
