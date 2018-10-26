/**
 *   file created it in ./NetBeans/CodeTinkering/Data.txt
 */
package datafiles;
import java.io.*;
import java.util.stream.*;

public class FileOutWriter {

    public static void main(String[] args) throws Exception{
       File file = new File("Data.txt");
       FileWriter output = new FileWriter(file);
       // A
//       Stream.of('0','1','2','3','4').forEach(output::write);
       // B
       PrintWriter p = new PrintWriter(output);
       Stream.of('0','1','2','3','4').forEach(p::write);
       // C
       output.write(new char[] { '0','1','2','3','4' });
       // D
       for (int i=0; i<5; i++) {
           output.write(String.valueOf(i));
       }
       // E
//       for (int i=0; i<5; i++) {
//           file.setWritable(i);         // s/b boolean parameter
//           file.toString();
//       }       
       output.flush();
    }
    
}
