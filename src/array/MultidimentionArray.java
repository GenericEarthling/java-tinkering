/**
 * https://www.youtube.com/watch?v=TlFC8tAqD9w
 */
package array;

public class MultidimentionArray {

    public static void main(String[] args) {
        int [][][] x = new int[12][5][2];
        System.out.println(x.length);           // 12
        System.out.println(x[1].length);           // 5
        System.out.println(x[2].length);           // 5
        System.out.println(x[3].length);           // 5
        System.out.println(x[0][1].length);           // 2
        System.out.println(x[0][2].length);           // 2
        System.out.println(x[0][3].length);           // 2
        System.out.println(x[0][0][0]);           // 0
        
        int[][] a = new int[4][4];                 // 16 digits  uses 2 loops
        int[][][] b = new int[4][4][4];           //  64 digits  ises 3 loops
        // populate array
        for (int i = 0; i<4; i++) {
            for (int j=0; j<4; j++) {
                for (int k=0; k<4; k++) {
                    b[i][j][k] = (int)(Math.random()*10);
                }
            }
        }
        System.out.println("using for loop to display multi array...");
        // print the array
        for (int i = 0; i<4; i++) {
            for (int j=0; j<4; j++) {
                for (int k=0; k<4; k++) {
                    System.out.print( " " + b[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }   
        System.out.println("using foreach loop to display multi array...");
        // for each loop
        for(int[][] i : b) {
            for(int[] j : i) {
                for(int k : j) {
                    System.out.print(" " + k);
                }
                System.out.println();
            }
            System.out.println();
        }
        
        
//        int[][][] y = {{{1,2},{3,4}},{{5,6},{7,8}}};
        int [][][] y = new int[3][2][2];
        for (int i = 0; i<y.length; i++) {
            for (int j=0; j<y[0].length; j++) {
                for (int k=0; k<y[0][0].length; k++) {
                    y[i][j][k] = (int)(Math.random()*10);
                }
            }
        }        
        // print the array
        System.out.println(" printing smaller array");
        for (int i = 0; i<y.length; i++) {
            for (int j=0; j<y[0].length; j++) {
                for (int k=0; k<y[0][0].length; k++) {
                    System.out.print( " " + y[i][j][k]);
                }
                System.out.println();
            }
//            System.out.println();
        }   
        boolean[][] bool = new boolean[3][];
        bool[0]=new boolean[1];
        bool[1]=new boolean[2];
        bool[2]=new boolean[3];
        System.out.println(bool[2][2]);

        // from learning Lad https://www.youtube.com/watch?v=d8x5Nciymjs
        // studentGrades[studentName][examNumber][grade]
        // the only numbers that are recorded are the grades, the rest are for referencing the grades
/*        int[][][] studentGrades = new int[3][2][2];
        studentGrades[0][0][0] = 96; // 1st student: 1st exam, 1st grade
        studentGrades[0][0][1] = 93; // 1st student: 1st exam, 2nd grade
        studentGrades[0][1][0] = 70; // 1st student: 2nd exam, 1st grade
        studentGrades[0][1][1] = 75; // 1st student: 2nd exam, 2nd grade
        studentGrades[1][0][0] = 85; // 2nd student: 1st exam, 1st grade
        studentGrades[1][1][1] = 90; // 2nd student: 2nd exam, 2nd grade
*/        
        // initializing an array from the beginning
        // studentGrades[studentName][examNumber][grade]
        int[][][] studentGrades = {
                { {96,93},{70,75} },    // 1st student: 1st exam, grades | 2nd exam, grades
                { {85,88},{79,90} },    // 2nd student: 1st exam, grades | 2nd exam, grades
                { {89,95},{99,92} }     // 3rd student
        };
    
        // display data
        System.out.println("\n3-D array of students and exam");
        for (int studentNum = 0; studentNum < studentGrades.length; studentNum++) {
            System.out.println("Student Number: " + (studentNum+1)); // add +1 so number does start at zero
            for (int examNum = 0; examNum < studentGrades[studentNum].length; examNum++) {
                System.out.println("Exam Number: " + (examNum+1));
                System.out.println("Grades are: ");
                for (int grades = 0; grades < studentGrades[studentNum][examNum].length; grades++) {
                    System.out.print( " " + studentGrades[studentNum][examNum][grades] + "\t");
                }
                System.out.println();
            }
//            System.out.println();
        }        
        
        
    }
    
}
