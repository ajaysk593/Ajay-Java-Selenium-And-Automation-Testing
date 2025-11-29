package ExceptionHandling;

class MyThread extends Thread { // Step 1: Extend Thread class

    // Step 2: Override run() method
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // Step 3: Create objects of MyThread
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        // Step 4: Start the threads
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}
