package HWK4_barretg;

import java.io.*;

public class MP3 extends Audio {
    private int price; // added
    @Override
    public int getPrice () {
        //override and only call the parent's getPrice() to get the base price
        return price;
    }
}