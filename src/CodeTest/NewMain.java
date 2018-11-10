/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeTest;

/**
 *
 * @author Tender
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                final int[] count = new int[] {0};
                
                for(int i = 0; i < 100; i++) {
                    new Thread() {
                                                
                    @Override                                          
                    public void run() {             
                         System.out.println(++count[0]);
                    }
                                                
                        }.start();
                }              
}

    }
    

