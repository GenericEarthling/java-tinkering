package javatesting;

public class B extends A 
{
    int x = 5;  // goes with TESTING modifiers
    
    public B() {  count++;  }   // TESTING class and modifiers
    
    public static void main(String s[]) 
    {
        // TESTING class and modifiers
        // illegal start of expression && field hides another field
//        public int x = 6;    
        B b = new B();
        System.out.println(b.x);
        

        
        // TESTING class and modifiers
        A b2 = new B();
        System.out.println("Count = " + getCount());
        A c = new B();
        B d = new B();
        System.out.println("Count = " + getCount());
            
        
    }
    
}
class A {
    protected static int count = 0;
    public A(){ count++; }
    static int getCount() { return count; }
}