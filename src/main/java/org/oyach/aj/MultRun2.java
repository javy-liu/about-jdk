package org.oyach.aj;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by oych on 15/1/20.
 *
 * @author oyach
 * @since 0.0.1
 */
public class MultRun2 implements Runnable {

    private static AtomicInteger i = new AtomicInteger();

    private static AtomicInteger j = new AtomicInteger();

    private String name;

    public MultRun2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (i.get() < 20) {
            System.out.println(name + ":i=" + i.getAndIncrement());
            System.out.println(name + ":j=" + j.getAndIncrement());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
