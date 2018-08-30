package cn.zhangyuying.designpattern.singleton.singleton;

/**
 * @author zyy.
 */
public class InternalClassSingleton {
    private InternalClassSingleton() {
    }

    public static InternalClassSingleton getInstance() {
        return Internal.instance;
    }

    private static class Internal {
        private static InternalClassSingleton instance = new InternalClassSingleton();
    }
}
