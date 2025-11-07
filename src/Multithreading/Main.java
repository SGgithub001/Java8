package Multithreading;

import java.util.concurrent.FutureTask;

public class Main {

    // -------------------------------------- Multithreading ---------------------------------------------
// -> Process: program in execution | Thread: smallest unit of process
// -> Multithreading = multiple threads run concurrently (better CPU use)
// -> Create Thread:
//    1) extend Thread + override run()  2) implement Runnable + pass to new Thread()
// -> Important methods: start(), run(), sleep(ms), join(), isAlive(), setPriority()
// -> Thread states: New -> Runnable -> Running -> Waiting/Sleeping -> Dead
// -> Benefits: faster, efficient, simultaneous tasks (e.g. games, servers)
// -> Use Case: logging, file download, parallel tasks
// Runnable: no return, no exception, use with Thread
// Callable: returns value, can throw exception, use with ExecutorService
// Synchronization: ensures only one thread accesses shared resource at a time (thread-safe)


    public static void main(String[] args) throws InterruptedException {
        /*
        System.out.println("Inside the main thread : " + Thread.currentThread().getName());
        System.out.println("Starting of main thread");

        Thread thread = new MyTask();
        thread.setName("Sushil");
        thread.start();
        thread.join();       //Used to ensure one thread completes before another starts

        System.out.println("Ending of main thread");
         */

        RunnableThread runnableThread = new RunnableThread();
        Thread thread1 = new Thread(runnableThread);
        thread1.start();

        CallableThread callableThread = new CallableThread();
        FutureTask<Integer> futureTask = new FutureTask<>(callableThread);  //use for getting extra info about thread
        Thread thread2 = new Thread(futureTask);
        thread2.start();
        Thread.sleep(1000);
        System.out.println(futureTask.isDone());
    }
}
