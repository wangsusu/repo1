package com.susu.designModel;

/**
 * 单例模式：简单点说，就是一个应用程序中，某个类的实例对象只有一个，
 * 你没有办法去new，因为构造器是被private修饰的，一般通过getInstance()的方法来获取它们的实例。
 * getInstance()的返回值是一个对象的引用，并不是一个新的实例，所以不要错误的理解成多个对象。
 */
//懒汉写法（线程不安全）
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
// 懒汉式写法（线程安全）
class Singleton2 {
    private static Singleton2 instance;
    private Singleton2 (){}
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

//饿汉式写法
class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3 (){}
    public static Singleton3 getInstance() {
        return instance;
    }
}

//静态内部类
class Singleton4 {
    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }
    private Singleton4 (){}
    public static final Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

//枚举 这种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象，
// 可谓是很坚强的壁垒啊，不过，个人认为由于1.5中才加入enum特性，用这种方式写不免让人感觉生疏。
enum Singleton5 {
    INSTANCE;
    public void whateverMethod() {
    }
}

//双重锁校验
class Singleton6 {
    private volatile static Singleton6 singleton;
    private Singleton6 (){}
    public static Singleton6 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton6.class) {
                if (singleton == null) {
                    singleton = new Singleton6();
                }
            }
        }
        return singleton;
    }
}

/**
 * 总结：我个人比较喜欢静态内部类写法和饿汉式写法，其实这两种写法能够应付绝大多数情况了。其他写法也可以选择，主要还是看业务需求吧。
 */
