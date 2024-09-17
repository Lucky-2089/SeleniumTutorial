class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing.");
    }
}
/*Explanation:

Runnable is an interface that defines a task to be run in a thread.
Two threads (thread1 and thread2) are created and started. Each thread runs the run() method of MyTask.
This allows both tasks to run concurrently.*/
public class ConcurrencyThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyTask(), "Thread 1");
        Thread thread2 = new Thread(new MyTask(), "Thread 2");

        thread1.start();
        thread2.start();
    }
}