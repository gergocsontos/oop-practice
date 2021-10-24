package com.codecool.ooppractice.gergocsontos.contentorganizer.bands;

import java.util.HashSet;
import java.util.Set;

public class BandCollection {
    private final Set<Band> bands = new HashSet<>();

    public void addBand(Band band) {
        bands.add(band);
    }

    public Set<Band> getBands() {
        return bands;
    }
}