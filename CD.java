package HWK4_barretg;
import java.io.*;

public class CD extends Audio {

    private int price; // added
    @Override
    public int getPrice () {
        //override to get the item price and add 2% (Environment Tax)
        return price;
    }
}