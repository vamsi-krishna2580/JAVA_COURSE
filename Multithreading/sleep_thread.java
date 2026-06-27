class MyThread extends Thread {

    public void run() {

        for(int i=1;i<=5;i++) {

            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch(Exception e) {}
        }
    }
}
class sleep_thread{
    public static void main(String args[]){
        Thread t = new MyThread();
        t.run();
    }
}
