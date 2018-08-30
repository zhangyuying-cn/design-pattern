package cn.zhangyuying.designpattern.singleton.singleton;

/**
 * @author zyy.
 */
public class EagerlySingleton {
    private static EagerlySingleton instance = new EagerlySingleton();

    private EagerlySingleton() {

    }

    public static EagerlySingleton getInstance() {
        return instance;
    }

    public void sayHello() {
        System.out.println("hello");
    }
}
