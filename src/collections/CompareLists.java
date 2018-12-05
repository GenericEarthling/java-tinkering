/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author Tender
 */
public class CompareLists {
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> scores = new ArrayList<>();
        int scoreA = 0, scoreB = 0;
        
        // for each: compare and assign points to a or b
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i))
                scoreB++;
            if (a.get(i) > b.get(i))
                scoreA++;
        }
        scores.add(scoreA);
        scores.add(scoreB);

        return scores;
    }
    public static void main(String[] args) throws IOException {
//        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH"))) ) {
//
//            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//            List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//            
//            List<Integer> result = compareTriplets(a, b);
//
//            bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining(" "))
//                + "\n"
//            );
//        } catch (IOException ioe) {
//            System.err.println(ioe.toString());
//        } finally {
//            bufferedReader.close();
//            bufferedWriter.close();            
//        }

        // sample input 1:  5  6  7    3  6 10
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);
//        List<Integer> result = compareTriplets(a, b);
        // sample input 2: 17 28 30   99 16  8        
        List<Integer> a2 = new ArrayList<>();
        a2.add(17);
        a2.add(28);
        a2.add(30);
        List<Integer> b2 = new ArrayList<>();
        b2.add(99);
        b2.add(16);
        b2.add(8);
//        List<Integer> result2 = compareTriplets(a2, b2);
        // display results
//        for (Integer i : result){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        for (Integer i : result2){
//            System.out.print(i+" ");
//        }        
//        System.out.println();

        System.out.println( compareTriplets(a2,b2) );
    }

    
    
}
