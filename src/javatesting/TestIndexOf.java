/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatesting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tender
 */
public class TestIndexOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Pen");
        items.add("Pencil");
        items.add("Box");
        for (String i : items) {
            if (i.indexOf("e") == 1) {
                continue;
            } 
            else {
                System.out.print(i + " ");
            }
        }
    }
    
}
