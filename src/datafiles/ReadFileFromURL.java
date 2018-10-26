/*
 * displays HTML from user specified URL address
 * displays the number of bytes in the website
 */
package datafiles;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.net.URL;

/**
 *
 * @author Liang
 */
public class ReadFileFromURL {

    public static void main(String[] args) {
        System.out.print("Enter URL to read: ");
//        String urlAddress = new Scanner(System.in).next();
        String urlAddress = new Scanner(System.in).nextLine();
        
        try {
            URL url = new URL(urlAddress);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                System.out.println(line);
                count += line.length();
            }
            System.out.println("The file size is: " + count + " bytes.");
        } catch (MalformedURLException ex) {
            System.out.print("Malformed URL: " + ex);
        } catch (IOException ex) {
            System.out.println("Input/Output Error: " + ex);
        }
    }
    
}
