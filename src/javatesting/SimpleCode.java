/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatesting;

public class SimpleCode {

    public static void main(String[] args) {
        int i = 10;
        int j = 12;
        for (;;) 
            if (i++ < j--) {
                System.out.println(i + " " + j);
                continue;
            } else {
                break;
            }
            System.out.println(i + " " + j);
        
    }
    
}
