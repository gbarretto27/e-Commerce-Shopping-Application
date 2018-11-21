package HWK4_barretg;

import java.io.*;

public class Audio extends Item {

    protected String artistName;
    private int price; // added
    public String getInfo () {
        // Returns sNo, Name, Artist, name, etc in a string
        return artistName;
    }

    @Override
    public int getPrice () {
        //override
        return price;
    }
}