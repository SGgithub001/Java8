package Multithreading;

// -------------------------------------- Synchronization ---------------------------------------------------
// -> Used to control access of multiple threads to shared resources
// -> Ensures thread-safe operations and prevents race conditions
// -> Can be applied with synchronized method or synchronized block
// synchronized: allows only one thread at a time to access a method/block (thread-safe)
// Object-level lock: per object instance, only one thread at a time.
// Class-level lock: on Class, affects all instances (static methods).

public class Synchronization {
    public static void main(String[] args) {
        Account account = new Account();
        account.balance = 1000;

        Thread request1 = new NetBanking(account,200.00);
        Thread request2 = new NetBanking2(account,300.00);
        request1.start();
        request2.start();

    }
}

class Account extends Thread{
    double balance;
    public synchronized void withdrawAmount(double amount){            //Synchronized keyword -> Ensures only one thread at a time can access a method or block
        this.balance = balance - amount;
        System.out.println("Final balance : " + this.balance);
    }
}

class NetBanking extends Thread{
    Account account;
    double withdrawamt;
    NetBanking(Account account, double withdraw){
        this.account = account;
        this.withdrawamt = withdraw;
    }

    @Override
    public void run() {
        account.withdrawAmount(withdrawamt );
    }
}

class NetBanking2 extends Thread{
    Account account;
    double withdrawamt;
    NetBanking2(Account account, double withdraw){
        this.account = account;
        this.withdrawamt = withdraw;
    }

    @Override
    public void run() {
        account.withdrawAmount(withdrawamt );
    }
}
