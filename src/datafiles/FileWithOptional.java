/**
 * https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
 */
package datafiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Optional;

public class FileWithOptional {

    public static void main(String[] args) throws IOException {
        // .of() Returns an Optional with the specified present non-null value.
        Optional<String> file = Optional.of("OptFile.java");
        // .get() If a value is present in this Optional, returns the value, 
        //      otherwise throws NoSuchElementException.
        // Returns: the non-null value held by this Optional
        File optFile = new File(file.get());

        // FileReader is meant for reading streams of characters. For reading 
        //   streams of raw bytes, use a FileInputStream.
        Reader reader = new FileReader(optFile);        // must throw FileNotFoundException

        
        // FileInputStream is meant for reading streams of raw bytes such as 
        //    image data. For reading streams of characters, consider using FileReader.
        InputStream is = new FileInputStream(optFile);// must throw FileNotFoundException

        // FileOutputStream is meant for writing streams of raw bytes for image data. 
        // For writing characters use FileWriter.
        FileOutputStream fos = new FileOutputStream(optFile);      // must throw FileNotFoundException
        
        // constructor parameter must be (String, String) or (File, String)
//        RandomAccessFile raf = new RandomAccessFile(optFile);

        // Input Stream is abstract
//        InputStream is2 = new InputStream(optFile) ;

    }
    
}
