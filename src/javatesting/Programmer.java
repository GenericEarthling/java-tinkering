/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatesting;

public class Programmer extends Writer {
    
    private static int count;
    static {
        System.out.println("In Programmer - initialization block 1");
        count = 10;
    }
    private int[] data;
    {
        System.out.println("In Programmer - block 2, runs every new object call");
        data = new int[count];
        for (int i = 0; i < count; i++) {
            data[i] = i;
        }
//        count++;
    }

    public static void write() {
        System.out.println("From Programmer write() call");
    }
    
    public static void main(String[] args) {
        System.out.println("Count = " + count);
        System.out.println("Before 1st call to new");
        Programmer test1 = new Programmer();
        System.out.println("Before 2nd Call to new");
        Programmer test2 = new Programmer();
        Writer w = new Programmer();
        Author.write();
        System.out.println(count);
        
    } // end of main
    
}
class Writer {
    public static void write() {
        System.out.println("From Writer write() call");
    }
}
class Author extends Writer {
    public static void write() {
        System.out.println("From Author write() call");
//        Programmer.count++;
    }
} // end of Programmer class
