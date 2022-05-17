package org.example.springcourse.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music;
    private IndieMusic indieMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(IndieMusic indieMusic, RockMusic rockMusic) {
        this.indieMusic = indieMusic;
        this.rockMusic = rockMusic;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String playMusic() {
        return "Playing: " + rockMusic.getSong();
    }
}
