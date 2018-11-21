package HWK4_barretg;

import java.io.*;

public class eBook extends Readable {

    private int price; // added
    @Override
    public int getPrice () {
        //override and only call the parent's constructor to get the base price
        return price;
    }
}