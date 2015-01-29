package org.oyach.aj;

import org.junit.Test;

/**
 * Created by oych on 15/1/22.
 *
 * @author oyach
 * @since 0.0.1
 */
public class TestAtomic {

    private static final int num = 10;



    /**
     * 多线程使用变量i 非线程安全
     *
     * @throws Exception
     */
    @Test
    public void test01() throws Exception {

        for (int i = 0; i < num; i++) {
            MultRun m = new MultRun("线程" + i);
            Thread t = new Thread(m);
            t.start();
        }


        // 防止主线程停止
        Thread.sleep(5000);

    }

    /**
     * 原子性操作 线程安全
     * @throws Exception
     */
    @Test
    public void test02() throws Exception {

        for (int i = 0; i < num; i++) {
            MultRun2 m = new MultRun2("线程" + i);
            Thread t = new Thread(m);
            t.start();
        }


        // 防止主线程停止
        Thread.sleep(100);

    }

}
