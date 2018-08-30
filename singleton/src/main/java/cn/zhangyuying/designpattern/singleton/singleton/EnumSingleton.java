package cn.zhangyuying.designpattern.singleton.singleton;

/**
 * @author zyy.
 */
public enum EnumSingleton {
    //定义1个枚举的元素，即为单例类的1个实例
    instance;

    // 隐藏了1个空的、私有的 构造方法
    // private Singleton () {}

    public void sayHello() {
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }

}
