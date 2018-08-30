package cn.zhangyuying.designpattern.singleton;

import cn.zhangyuying.designpattern.singleton.singleton.EagerlySingleton;
import cn.zhangyuying.designpattern.singleton.singleton.EnumSingleton;
import cn.zhangyuying.designpattern.singleton.singleton.InternalClassSingleton;
import cn.zhangyuying.designpattern.singleton.singleton.LazilyBasicSingleton;
import cn.zhangyuying.designpattern.singleton.singleton.LazilyDoubleCheckSingleton;
import cn.zhangyuying.designpattern.singleton.singleton.LazilyLockSingleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Constructor;

@SpringBootApplication
public class SingletonApplication {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(SingletonApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SingletonApplication.class, args);
        //1.饿汉式
        //        依赖 JVM类加载机制，保证单例只会被创建1次，即 线程安全
        //        (1)JVM在类的初始化阶段(即 在Class被加载后、被线程使用前)，会执行类的初始化
        //        (2)在执行类的初始化期间，JVM会去获取一个锁。这个锁可以同步多个线程对同一个类的初始化
        eagerlyInitializedSingleton();
        //2.枚举实现单例类
        //        枚举是可以根据自己特性阻止通过反射获取到私有构造方法从而实例化（实现单例类的方法中唯一可以阻止反射的，
        //        其余方式想要阻止反射，可以设置标志位，具体不在此陈述）
        //        根据枚举类型的特点，满足单例模式所需的 创建单例、线程安全、实现简洁的需求
        enumInitializedSingleton();
        //3.懒汉式-基础实现
        //        不是线程安全的
        lazilyBasicInitializedSingleton();
        //4.懒汉式-同步锁
        //        缺点:每次访问都要进行线程同步（即 调用synchronized锁)，造成过多的同步开销（加锁 = 耗时、耗能）
        //        实际上只需在第1次调用该方法时才需要同步，一旦单例创建成功后，就没必要进行同步
        lazilyLockInitializedSingleton();
        //5.懒汉式-双重校验锁
        //        缺点:实现复杂 = 多种判断，易出错
        lazilyDoubleCheckInitializedSingleton();
        //6.静态内部类
        //        原理：根据 静态内部类 的特性，同时解决了按需加载、线程安全的问题，同时实现简洁
        //        （1）在静态内部类里创建单例，在装载该内部类时才会去创建单例
        //        （2）线程安全：类是由 JVM加载，而JVM只会加载1遍，保证只有1个单例
        InternalClassInitializedSingleton();

    }

    private static void eagerlyInitializedSingleton() {
        //1.饿汉式
        EagerlySingleton eagerlySingleton1 = EagerlySingleton.getInstance();
        EagerlySingleton eagerlySingleton2 = EagerlySingleton.getInstance();
        eagerlySingleton1.sayHello();
        //正常获取
        System.out.println(eagerlySingleton1);
        System.out.println(eagerlySingleton2);
        //非正常方式(可通过反射获取到私有构造方法从而实例化)
        try {
            Class eagerlySingletonClass = Class.forName("cn.zhangyuying.designpattern.singleton.singleton.EagerlySingleton");
            Constructor eagerlySingletonBuilder = eagerlySingletonClass.getDeclaredConstructor();
            eagerlySingletonBuilder.setAccessible(true);
            EagerlySingleton eagerlySingleton = (EagerlySingleton) (eagerlySingletonBuilder.newInstance());
            System.out.println(eagerlySingleton);
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    private static void enumInitializedSingleton() {
        //2.枚举实现单例类
        EnumSingleton enumSingleton1 = EnumSingleton.instance;
        EnumSingleton enumSingleton2 = EnumSingleton.instance;
        enumSingleton1.sayHello();
        System.out.println(enumSingleton1);
        System.out.println(enumSingleton2);
    }

    private static void lazilyBasicInitializedSingleton() {
        //3.懒汉式-基础实现
        LazilyBasicSingleton lazilyBasicSingleton1 = LazilyBasicSingleton.getInstance();
        LazilyBasicSingleton lazilyBasicSingleton2 = LazilyBasicSingleton.getInstance();
        lazilyBasicSingleton1.sayHello();
        System.out.println(lazilyBasicSingleton1);
        System.out.println(lazilyBasicSingleton2);
    }

    private static void lazilyLockInitializedSingleton() {
        //4.懒汉式-同步锁
        LazilyLockSingleton lazilyLockSingleton1 = LazilyLockSingleton.getInstance();
        LazilyLockSingleton lazilyLockSingleton2 = LazilyLockSingleton.getInstance();
        lazilyLockSingleton1.sayHello();
        System.out.println(lazilyLockSingleton1);
        System.out.println(lazilyLockSingleton2);
    }

    private static void lazilyDoubleCheckInitializedSingleton() {
        //5.懒汉式-双重校验锁
        LazilyDoubleCheckSingleton lazilyDoubleCheckSingleton1 = LazilyDoubleCheckSingleton.getInstance();
        LazilyDoubleCheckSingleton lazilyDoubleCheckSingleton2 = LazilyDoubleCheckSingleton.getInstance();
        lazilyDoubleCheckSingleton1.sayHello();
        System.out.println(lazilyDoubleCheckSingleton1);
        System.out.println(lazilyDoubleCheckSingleton2);
    }

    private static void InternalClassInitializedSingleton() {
        //6.静态内部类
        InternalClassSingleton internalClassSingleton1 = InternalClassSingleton.getInstance();
        InternalClassSingleton internalClassSingleton2 = InternalClassSingleton.getInstance();
        System.out.println(internalClassSingleton1);
        System.out.println(internalClassSingleton2);
    }

}
