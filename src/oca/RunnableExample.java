/**
 * Lambda replacing anonymous inner class
 */
package oca;

public class RunnableExample {

    public static void main(String[] args) {
        // Threads HAVE to implement Runnable 
        // new constructor Thread(Runnable target)
        // this thread calls Runnable as an anonymous inner class that overrides run()
        Thread t = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println("running..."); //To change body of generated methods, choose Tools | Templates.
            }            
        });   // notice the ; of anonymous innerclass
        // call the thread
        t.run();
        
        /**
         *  using the lambda way...
         * new Thread(Runnable target)
         */        
        Thread lambdaThread = new Thread( () -> System.out.println("running from lambda...") );
        lambdaThread.run();
        
        Thread mythread = new Thread( ()-> System.out.println("running...") ); 
         
        // call the thread
        mythread.start();       // JVM calls the run() 
        
    }
    
}
