package cn.zhangyuying.designpattern.observer;

import cn.zhangyuying.designpattern.observer.customimpl.MsgSubject;
import cn.zhangyuying.designpattern.observer.customimpl.QQObserver;
import cn.zhangyuying.designpattern.observer.customimpl.WeChatObserver;
import cn.zhangyuying.designpattern.observer.utilimpl.FlyLetterObserver;
import cn.zhangyuying.designpattern.observer.utilimpl.MsgSubjectImplUtil;
import cn.zhangyuying.designpattern.observer.utilimpl.SMSObserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObserverApplication.class, args);
        //1.观察者模式：自定义的变化主题和观察者
        CustomSubject subject = new MsgSubject();
        subject.attach(new QQObserver());
        subject.attach(new WeChatObserver());
        subject.subjectChange();

        //2.观察者模式：使用JDK util中的被观察者类和观察者接口
        //此处没有使用  Observable observable=new MsgSubjectImplUtil();
        //因为 改变状态的接口是非static的且为protected，所以此处直接使用了子类
        MsgSubjectImplUtil msgSubject = new MsgSubjectImplUtil();
        // observer里面含有被观察者的引用：可以自己将自己注册进去
        new SMSObserver(msgSubject);
        new FlyLetterObserver(msgSubject);
        msgSubject.subjectChange();
    }

}
