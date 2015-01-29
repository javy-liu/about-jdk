package org.oyach.designpattern;

/**
 * 引入延迟加载的单例
 *
 * 优点：
 * 1. 可以控制单例的实例化
 *
 * 缺点：
 * 1.为了保证多线程环境下是否安全，使用了同步的getInstance
 *
 * @author oyach
 * @since 0.0.1
 */
public class Singleton2 {
    private static Singleton2 instance = null;


    public Singleton2() {

        System.out.println("创建单例！");
    }

    public static synchronized Singleton2 getInstance(){

        if (instance == null){

            instance = new Singleton2();
        }
        return instance;
    }

    public static void create(){
        System.out.println("调用该类的静态方法");
    }
}
