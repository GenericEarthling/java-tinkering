
package collections;

public class Test {
    int data = 20;
    { data = 10; }
    Test() {
        data = 40;
        System.out.println("Constructor: data = " + data);
    }
    void displayData() {
        System.out.println("data = " + data);
    }

    public static void main(String[] args) {
        int x = 0;
        Test t = new Test();
        t.displayData();
    }
    
}
