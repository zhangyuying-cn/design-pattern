package cn.zhangyuying.designpattern.singleton.singleton;

/**
 * @author zyy.
 */
public class LazilyBasicSingleton {
    private static LazilyBasicSingleton instance;

    private LazilyBasicSingleton() {
    }

    public static LazilyBasicSingleton getInstance() {
        if (instance == null) {
            instance = new LazilyBasicSingleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("hello");
    }
}
