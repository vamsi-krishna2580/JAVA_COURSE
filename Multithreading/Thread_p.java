class MyThread extends Thread {

    public void run() {
        System.out.println("Thread Running");
    }
}

public class Thread_p {
    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();

        System.out.println("Main Thread");
    }
}