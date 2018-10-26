/**
 *
 * 
 */
package oca;

public class Arrays {

    public static void main(String[] args) {
        System.out.println("--------- char Arrays -----------");        
        char[][] cB = {  { 'a', 'b', 'c' }, { 'a', 'b', 'c' } };
        char cA[][] = new char[3][];
        for (int i=0; i<cA.length; i++) 
            cA[i] = new char[4];
        System.out.println("cA array = "+cA[2][3]);
        System.out.println("----------------------");
        char cD[][] = { new char[]{ 'a', 'b', 'c' } , new char[]{ '7', '8', '9' }  };    
//        char cD[][] = new char[][] {  { 'a', 'b', 'c' }, { 'a', 'b' }   };
        for (int i=0; i<cD.length; i++) {
            System.out.println("cD["+i+"][0] = " + cD[i][0] + "\t");       
            for ( int j=0; j<cD[i].length; j++) {
                System.out.print("cD["+i+"]["+j+"] = " + cD[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("--------- null in Arrays -----------");        
        String[] dataArr = new String[4];
        dataArr[1] = "Bill";
        dataArr[2] = "Steve";
        dataArr[3] = "Larry";
        try{
            for(String data : dataArr){
                System.out.print(data+" ");
            }
        }catch(Exception e){
            System.err.println(e.getClass());
        }
        System.out.println(dataArr[0] + "\n");   // null

        System.out.println("--------- Overloading main() -----------");        
        Arrays na = new Arrays();
//        String[][] newArgs = {{"a","b","c"},{"x","y","z"}};
        String[][] newArgs = {{"a","b","c"}};
        na.main(newArgs);
        System.out.println();
        System.out.println(newArgs);
        
    }
    public static void main(String[][] args) {
        System.out.println(args[0][0]);
        for (int i=0; i<args.length; i++) {
            System.out.println("args["+i+"][0] = " + args[i][0] + "\t");       
            for ( int j=0; j<args[i].length; j++) {
                System.out.print("args["+i+"]["+j+"] = " + args[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i=0; i<args.length; i++)
            System.out.println(args[i][0] + "\t args length is "+ args.length );
    }
    
}
