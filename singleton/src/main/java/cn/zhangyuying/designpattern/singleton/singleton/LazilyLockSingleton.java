package cn.zhangyuying.designpattern.singleton.singleton;

/**
 * @author zyy.
 */
public class LazilyLockSingleton {
    private static LazilyLockSingleton instance;

    private LazilyLockSingleton() {
    }

    public static synchronized LazilyLockSingleton getInstance() {
        if (instance == null) {
            instance = new LazilyLockSingleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("hello");
    }
}
