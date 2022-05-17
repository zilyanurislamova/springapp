package org.example.springcourse.lesson13;

import org.springframework.stereotype.Component;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Sonne";
    }
}
