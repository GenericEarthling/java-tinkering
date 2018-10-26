package datafiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadWrite {

    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("input.dat"));
//        BufferedReader b2 = new BufferedReader("input2.dat");
//        BufferedReader b3 = new BufferedReader(new InputStreamReader("input3.dat"));
        FileReader fr = new FileReader("ddata.dat");
        
        
    }
    
}
