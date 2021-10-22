package com.codecool.ooppractice.gergocsontos.contentorganizer.bands;

import com.codecool.ooppractice.gergocsontos.contentorganizer.concerts.Concert;

import java.util.Optional;

public class Band {
    private String name;
    private MusicStyle style;
    private BandType type;
    private Concert concert;
    private BandCollection bandCollection;

    public Band(String name, MusicStyle style, BandCollection bandCollection) {
        this.name = name;
        this.style = style;
        this.bandCollection = bandCollection;
        bandCollection.addBand(this);
    }

    public Optional<Band> chooseWarmup() {
        return bandCollection.getBands().stream()
                .filter(band -> band.getStyle().equals(style))
                .filter(band -> !band.equals(this))
                .findFirst();
    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", style=" + style +
                ", type=" + type +
                '}';
    }

    public void setType(BandType type) {
        this.type = type;
    }

    public MusicStyle getStyle() {
        return style;
    }
}
