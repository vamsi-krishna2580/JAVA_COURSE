class Counter{
    int count;
    public synchronized void increment(){     // synchronized allows only one thread to access the resource at a time
        count++;
    }
}

public class sync{
    public static void  main(String args[]) throws InterruptedException{
        Counter c = new Counter();
        
        Runnable obj1 = ()->{   // lambda expression with single method(run)
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }}; 
        
            Runnable obj2 = ()->{
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }}; 
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();     // join used to wait the main thread until t1 completes its work
        t2.join();     // join used to wait the main thread until t2 completes its work
        
        System.out.println(c.count);

    }
}

// there are mainly three cases where inconsistency occurs:
// no synchronized -> (two threads work at a time on count increment is unpredictable)
// no join -> (main prints the count without waiting for t1, t2 to comeback)
// t1.start(), t2.start() which thread to start first is completely thread sheduler task -
// - we cant predict which starts first even though we write t1.start() first