package org.example.springcourse.lesson9;

import org.springframework.stereotype.Component;

@Component
public class IndieMusic implements Music {
    @Override
    public String getSong() {
        return "Geroi";
    }

}
