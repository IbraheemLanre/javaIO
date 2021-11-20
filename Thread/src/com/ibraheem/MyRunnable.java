package com.ibraheem;

import static com.ibraheem.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from Runnable's implementation of run");
    }
}
