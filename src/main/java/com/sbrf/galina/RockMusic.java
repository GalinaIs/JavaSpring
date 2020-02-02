package com.sbrf.galina;

import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music {
    @Override
    public List<String> getSongs() {
        return Arrays.asList("Rock music1", "Rock music2", "Rock music3");
    }
}
