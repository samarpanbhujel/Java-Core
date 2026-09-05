public class Demo2 {
    public static void main (String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 50; i++) {
                   System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj1 );
        Thread t2 = new Thread(obj2 );
        t1.start();
        t2.start();
    }
}
// This is a simple multithreading example in Java
// We can create multiple threads by extending the Thread class and overriding the run() method. 
// we can also create multiple threads by implementing the Runnable interface and passing it to a Thread object.
// In this example, we have created two threads using the Runnable interface and started them using the start() method.