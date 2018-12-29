package cn.zhangyuying.designpattern.visitor;

import cn.zhangyuying.designpattern.visitor.impl.MethodVisitor;
import cn.zhangyuying.designpattern.visitor.impl.QQElement;
import cn.zhangyuying.designpattern.visitor.impl.SMSElement;
import cn.zhangyuying.designpattern.visitor.impl.ThemeVisitor;
import cn.zhangyuying.designpattern.visitor.impl.WeChatElement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VisitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisitorApplication.class, args);
        MessageStructure messageStructure = new MessageStructure();
        messageStructure.addMessageElement(new QQElement());
        messageStructure.addMessageElement(new WeChatElement());
        messageStructure.addMessageElement(new SMSElement());

        messageStructure.setMessageProperties(new ThemeVisitor());
        messageStructure.setMessageProperties(new MethodVisitor());
    }

}

