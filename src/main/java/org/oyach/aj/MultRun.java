package org.oyach.aj;

/**
 * 多线程运行
 *
 * @author oyach
 * @since 0.0.1
 */
public class MultRun implements Runnable {

    // 多少个线程运行
    private static final int NUM_THREAD = 10;

    private static Object i;

    private String name;

    public MultRun(String name) {
        this.name = name;
    }

    @Override
    public void run() {
//        while (i < 20) {
//            System.out.println(name + ":" + i++);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

    }
}
