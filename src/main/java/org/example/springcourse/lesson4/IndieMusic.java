package org.example.springcourse.lesson4;

public class IndieMusic implements Music{
    @Override
    public String getSong() {
        return "Geroi";
    }

    private IndieMusic() {}

    public static IndieMusic getInstance() {
        return new IndieMusic();
    }

    public void doInit() {
        System.out.println("Initialization");
    }

    public void doDestroy() {
        System.out.println("Destruction");
    }
}
