package org.example.springcourse.lesson11;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return playlist[new Random().nextInt(playlist.length)];
    }

    private String[] playlist = {"Sonne", "Mein Herz Brennt", "DEUTSCHLAND"};
}
