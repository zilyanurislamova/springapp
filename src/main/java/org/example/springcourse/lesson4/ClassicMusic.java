package org.example.springcourse.lesson4;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
