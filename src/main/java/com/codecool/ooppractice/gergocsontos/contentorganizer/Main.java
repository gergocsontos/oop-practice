package com.codecool.ooppractice.gergocsontos.contentorganizer;

import com.codecool.ooppractice.gergocsontos.contentorganizer.bands.Band;
import com.codecool.ooppractice.gergocsontos.contentorganizer.bands.BandCollection;
import com.codecool.ooppractice.gergocsontos.contentorganizer.bands.MusicStyle;
import com.codecool.ooppractice.gergocsontos.contentorganizer.concerts.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Content Organizer!");
        BandCollection collection = new BandCollection();
        Band band = new Band("FooFighters", MusicStyle.ROCK, collection);
        Band band3 = new Band("Tee Fighters", MusicStyle.ROCK, collection);
        Band band2 = new Band("Ree Fighters", MusicStyle.ROCK, collection);
        Indoor concert = new Indoor(band, 13000);
        System.out.println(concert);
        concert.sellTicket();
        concert.sellTicket();
        concert.sellBeer();
        System.out.println(concert.calculateProfit());

    }
}
