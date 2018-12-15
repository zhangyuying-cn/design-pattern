package cn.zhangyuying.designpattern.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrototypeApplication.class, args);
        Receiver receiver = new Receiver("zyy", "123456789");
        MessagePrototype messagePrototype = new MessagePrototype();
        messagePrototype.setContext("收到请回复");
        messagePrototype.setReceiver(receiver);
        messagePrototype.setSendType("QQ");
        System.out.println("初始实例:");
        System.out.println(messagePrototype.toString());
        try {
            //浅拷贝
            MessagePrototype shallowCopyMsgPrototype = messagePrototype.clone();
            shallowCopyMsgPrototype.getReceiver().setName("zyy1");
            shallowCopyMsgPrototype.getReceiver().setPhone("1");
            System.out.println("浅拷贝:");
            System.out.println(shallowCopyMsgPrototype.toString());

            //深拷贝
            MessagePrototype deepCopyMsgPrototype = messagePrototype.deepClone();
            deepCopyMsgPrototype.getReceiver().setName("zyy2");
            deepCopyMsgPrototype.getReceiver().setPhone("2");
            System.out.println("深拷贝:");
            System.out.println(deepCopyMsgPrototype.toString());

            System.out.println("初始实例:");
            System.out.println(messagePrototype.toString());

            //登记形式的原型模式使用
            PrototypeManager.setPrototype("zyy", messagePrototype);
            PrototypeManager.setPrototype("zyy1", shallowCopyMsgPrototype);
            PrototypeManager.setPrototype("zyy2", deepCopyMsgPrototype);
            System.out.println(PrototypeManager.getPrototype("zyy2").toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

