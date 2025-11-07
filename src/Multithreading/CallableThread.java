package Multithreading;

import java.util.concurrent.Callable;

public class CallableThread implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("Callable thread started");
        return 1;
    }
}
