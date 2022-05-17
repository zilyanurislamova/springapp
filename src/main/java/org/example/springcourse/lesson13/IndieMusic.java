package org.example.springcourse.lesson13;

import org.springframework.stereotype.Component;

public class IndieMusic implements Music {
    @Override
    public String getSong() {
        return "Geroi";
    }

}
