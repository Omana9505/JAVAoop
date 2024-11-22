package com.multithread;

class TestSum extends Thread {
    int total = 0;

    @Override
    public synchronized void run() {
        for (int i = 0; i <= 10; i++) {
            total = total + i;
        }
        System.out.println("Total sum calculated by thread: " + total);
        synchronized (this) {
            notify();
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        TestSum ts = new TestSum();
        ts.start();

        synchronized (ts) {
            try {
                ts.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main thread resuming after receiving notification.");
        System.out.println("Final total sum is: " + ts.total);
    }
}
