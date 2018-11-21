package HWK4_barretg;

import java.io.*;

public class Readable extends Item {

    protected String authorName;
    private int price; // added
    public String getInfo () {
        // Returns sNo, Name, Author, name, etc in a string
        return authorName; // added
    }
    @Override
    public int getPrice () {
        //override
        return price;
    }
}