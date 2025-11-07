package Multithreading;

public class MyTask extends Thread{
    @Override
    public void run() {
//        try {
//            this.join();   -----> DeadLock like situation created
//        }catch (Exception e){
//
//        }
        for(int i = 0; i <= 10; i++){
            System.out.println(i + " inside the thread " + Thread.currentThread().getName());
        }
//        System.out.println("Stating a new Thread....."+ Thread.currentThread().getName());
    }
}
