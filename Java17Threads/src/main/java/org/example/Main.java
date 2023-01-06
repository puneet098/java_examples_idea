package org.example;

import static org.example.ThreadColor.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(ANSI_GREEN+"Hello world! this is from main thread.");
        var anotherThread = new AnotherThread();
        anotherThread.setName("==Another thread==");
        anotherThread.start(); //this is from the another class
        //anotherThread.interrupt();//interrupt another thread
        //anotherThread.run();//this will run on the same thread main
        new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println(ANSI_PURPLE+"Hello from anonymous class.");
            }
        }.start();

        var myRunnableThread = new Thread (new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED+"hello from anonymous implementation of myRunnable run() method");
                try{
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED+"Another thread terminated or timed out. So I'm running again.");
                }catch(InterruptedException ex){
                    System.out.println(ANSI_RED+"I couldn't wait after all. I was interrupted.");
                }
            }
        });
        myRunnableThread.start();
        var myAnonymous = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_CYAN+"My Runnable anonymous way of run");
            }
        });
        myAnonymous.start();

        System.out.println(ANSI_GREEN+"Hello Again from main thread.");
    }
}