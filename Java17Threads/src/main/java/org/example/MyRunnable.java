package org.example;

import static org.example.ThreadColor.ANSI_PURPLE;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_PURPLE+"Hello from myRunnable's implemenation of run().");
    }
}
