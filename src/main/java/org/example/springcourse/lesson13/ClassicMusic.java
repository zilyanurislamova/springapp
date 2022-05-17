package org.example.springcourse.lesson13;

import org.springframework.stereotype.Component;

public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
