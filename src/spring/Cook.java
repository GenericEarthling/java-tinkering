/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

/**
 *
 * @author Tender
 */
public class Cook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pie cherry = new Pie();    // dependency
        Oven hot = new Oven(cherry);
        
        String s = "--000.5";
        int i = (int) Math.round(Double.parseDouble(s.substring(1, s.length() - 1)));
        System.out.println(i);
    }
    
}
