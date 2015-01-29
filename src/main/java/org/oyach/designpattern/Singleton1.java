package org.oyach.designpattern;

/**
 * java 中最简单的单例方式
 *
 * 优点：
 * 1. 简单，而且可靠
 *
 * 缺点：
 * 1.install对象不能进行延迟加载，在jvm加载这个类的时候就会进行单例对象的创建
 *
 * @author oyach
 * @since 0.0.1
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();


    public Singleton1() {
        System.out.println("创建单例！");
    }

    public static Singleton1 getInstance(){

        return instance;
    }

    public static void create(){
        System.out.println("调用该类的静态方法");
    }
}
