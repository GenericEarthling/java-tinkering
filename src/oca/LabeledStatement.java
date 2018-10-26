/**
 * Syntax:
 * LableName: Statement/Loop
 * The scope of a label of a labeled statement is the immediately contained Statement.
 */
package oca;

public class LabeledStatement {

    public static void main(String[] args) {
       int c = 0;
       JACK: 
       while (c < 8){
           JILL: 
           if ( c<8 ){
               System.out.print(c);
               c++;
               break JILL;               
           }
       }
       System.out.println("\n" + c);
       System.out.println();
   
        int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) {  
//            System.out.println("outer: "+i);
            middle:
            for (int j = 0; j < 3; j++) {
//                System.out.println("middle: "+j);
                inner:
                for (int k = 0; k < 3; k++) {
//                    System.out.println("inner: "+k + " k-j: "+k+"-"+j+"=" + (k-j));
                    System.out.println("i="+i+" j="+j+" k="+k);
                    if (k - j > 0) {
                        System.out.println("break middle:");
                        break middle;
                    }
                    counter++;
                    System.out.println(counter);
                }
            }
        }
        System.out.println(counter);   
    }
    
    
    
}
