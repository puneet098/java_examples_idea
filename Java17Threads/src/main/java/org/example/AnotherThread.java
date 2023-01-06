package org.example;

import java.sql.SQLOutput;

import static org.example.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println(ANSI_BLUE+"running another thread run implmentation"+currentThread().getName());
        try{
            System.out.println(ANSI_BLUE+"I am going to sleep for 5 seconds."+currentThread().getName());
            Thread.sleep(5000);
        }catch(InterruptedException ex){
            System.out.println(ANSI_BLUE+"Another thread woke me up./"+currentThread().getName());
            return;
        }
        System.out.println(ANSI_BLUE+"Five seconds have passed and I'm in action."+currentThread().getName());
    }
}
