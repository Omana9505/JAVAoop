package com.multithread;

class Booking extends Thread {
    Object train = null;
    Object comp = null;

    public Booking(Object train, Object comp) {
        super();
        this.train = train;
        this.comp = comp;
    }

    public void run() {
        System.out.println(getName() + " Booking Start");
        synchronized (train) {
            System.out.println(getName() + " Book Train");
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            synchronized (comp) {
                System.out.println(getName() + " Book Comp");
            }
        }
        System.out.println(getName() + " Booking End");
    }
}

class Cancel extends Thread {
    Object train = null;
    Object comp = null;

    public Cancel(Object train, Object comp) {
        super();
        this.train = train;
        this.comp = comp;
    }

    public void run() {
        System.out.println(getName() + " Cancel Start");
        synchronized (comp) {
            System.out.println(getName() + " Cancel Comp");
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            synchronized (train) {
                System.out.println(getName() + " Cancel Train");
            }
        }
        System.out.println(getName() + " Cancel End");
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
        Object train = new Object();
        Object comp = new Object();

        Booking bookingThread = new Booking(train, comp);
        Cancel cancelThread = new Cancel(train, comp);

        bookingThread.setName("BookingThread");
        cancelThread.setName("CancelThread");

        bookingThread.start();
        cancelThread.start();
    }
}
