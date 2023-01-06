package org.example;
/*
 1)print even and odd by two threads: max is 20
    a)create two threads
    b) print numbers
 */
class  TaskEvenOdd implements Runnable{
    private int max;
    private Printer print;
    private boolean isEvenNumber;

    public TaskEvenOdd(int max, Printer print, boolean isEvenNumber) {
        this.max = max;
        this.print = print;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 1;
        }
    }
}

class Printer{
    private volatile boolean isOdd;
    synchronized void printEven(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = false;
        notify();
    }

    synchronized void printOdd(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = true;
        notify();
    }
}
public class Main {
    public static void main(String[] args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd( 10,print, false),"Odd");
        Thread t2 = new Thread(new TaskEvenOdd(10, print, true),"Even");
        t1.start();
        t2.start();
        System.out.println("Hello world!");
    }
}