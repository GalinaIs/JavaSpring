package com.sbrf.galina;

import org.springframework.stereotype.Component;

@Component("someRockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock music";
    }
}
