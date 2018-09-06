package cn.zhangyuying.designpattern.adapter;

import cn.zhangyuying.designpattern.adapter.adapter.SignalClassAdapter;
import cn.zhangyuying.designpattern.adapter.adapter.SignalObjectAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 场景：只存在发送消息的接口，现在想要发送信号量：两种方式实现的适配器：类适配器和对象适配器
 */
@SpringBootApplication
public class AdapterApplication {
    private static String signal = "成功信号";

    public static void main(String[] args) {
        SpringApplication.run(AdapterApplication.class, args);
        classAdapterSendSignal();
        objectAdapterSendSignal();
    }

    private static void classAdapterSendSignal() {
        SignalSender signalSender = new SignalClassAdapter();
        signalSender.sendSignal(signal);
    }

    private static void objectAdapterSendSignal() {
        SignalSender signalSender = new SignalObjectAdapter();
        signalSender.sendSignal(signal);
    }
}
