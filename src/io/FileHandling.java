package io;

import java.io.IOException;
import java.util.InputMismatchException;

public class FileHandling {

    public static void main(String[] args) throws InputMismatchException {
        try (java.util.Scanner input = new java.util.Scanner(System.in);) {
            int intValue = input.nextInt();
            double doubleValue = input.nextDouble();
            String line = input.nextLine();
            System.out.println(intValue + " " + doubleValue + " " + line);
//            String lineSeparator = System.getProperty("line.separator");
            System.out.println(System.getProperty("line.separator"));
            Exception e = null;
            throw e;
        } catch (InputMismatchException ime) {
            System.err.println(ime);
        }catch(Exception e){ 
            System.err.println(e);  // prints nullpointer
        }finally {
            System.out.println("finally...");
        }
        
        
        
    }
    
}
