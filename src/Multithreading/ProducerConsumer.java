package Multithreading;

// ------------------------------------- Producer-Consumer Problem -----------------------------------------------
// Classic multithreading problem where producer generates data and adds to a shared buffer,
// and consumer takes data from the buffer. Must be synchronized to avoid race conditions and data loss.
// Solved using:
// 1) wait() - producer waits if buffer is full, consumer waits if buffer is empty
// 2) notify()/notifyAll() - to wake waiting threads when buffer state changes
// Ensures thread-safe coordination between producer and consumer threads.

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        Producer producer = new Producer(sharedData);
        Consumer consumer = new Consumer(sharedData);
        producer.start();
        consumer.start();
    }
}
class Producer extends Thread{
    SharedData sharedData;
    Producer(SharedData data){
        this.sharedData = data;
    }
    public void run(){
        for(int i =0; i <= 10; i++){
            sharedData.producer(i);
        }
    }

}

class Consumer extends Thread{
    SharedData sharedData;
    Consumer(SharedData data){
        this.sharedData = data;
    }
    public void run(){
        for(int i =0; i <= 10; i++){
            sharedData.consume();
        }
    }
}
class SharedData{
    int data;
    boolean isProduced = false;
    public synchronized void producer(int data) {
        if (isProduced == true) {
            try{
                wait();
            }catch (Exception e){

            }
        }
        this.data = data;
        isProduced = true;
        System.out.println("Produced : " + data);
        notify();
    }

    public synchronized void consume(){
        if (isProduced == false) {
            try{
                wait();
            }catch (Exception e){

            }
        }
        System.out.println("Consume : "+ this.data);
        isProduced = false;
        notify();
    }
}


// 🔹 Producer-Consumer Problem 🔹
// - Producer creates data, consumer consumes from shared buffer
// - Use synchronized methods for thread safety
// - wait() makes thread wait if condition not met
// - notify()/notifyAll() wakes waiting threads
// - Always use while() for wait() to avoid spurious wake-ups