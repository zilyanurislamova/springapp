package org.example.springcourse.lesson11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
@Scope("prototype")
public class IndieMusic implements Music {
    @Override
    public String getSong() {
        return playlist[new Random().nextInt(playlist.length)];
    }

    private String[] playlist = {"Geroi", "Vishe domov", "Nebo nami nedovolno"};

    @PostConstruct
    public void doInit() {
        System.out.println("Init");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("Destroy");
    }
}
