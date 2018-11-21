package HWK4_barretg;

import java.io.*;
import java.util.Scanner;

public class UserInterface {
    //private String[] readables;
    //private​ String[] audioProducts;
    private int currentPage;
    /*
    private int getCurrentPage() {
        // This method is for navigation. Based on the values of the state variable, call  different pages 
    }
    private int changeCurrentPage() {
        // This method is for page navigation. It should change to the current page and show the content
    }
    */
    public void getReadables() {
        // Fetches all the readables from the files and places them in the readables array.
    }
    public void getAudioProducts() {
        // Fetches all audio products from the files and places them in the readables array
    }
    public void showReadables() {
        // Displays all readables for browsing.
    }
    public void showAudioProducts() {
        //Displays all audio prooducts for browsing.
    }


    public void page_01() {
        System.out.println("1. Sign in");
        System.out.println("2. Sign up");
        System.out.println("Choose your option: ");
        Scanner reader = new Scanner(System.in); //Reading input from System
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        while (n != 1 && n != 2) {
            System.out.print("Please enter a valid command (1 or 2). \n");
            n = reader.nextInt();
        }
        if (n == 1) {
            // code for if it is an existing username or not
        }
        else {
            page_02();
        }
    }
    public void page_02() {
        System.out.println("Choose your username: \n");
        Scanner reader = new Scanner(System.in);
        String username = reader.next();
    }
    public void page_03() {

    }
    public void page_04() {

    }
    public void page_05() {

    }
    public void page_06() {

    }
    public void page_07() {

    }
    public void page_08() {

    }
    public void page_09() {

    }
    public void page_10() {

    }
}
