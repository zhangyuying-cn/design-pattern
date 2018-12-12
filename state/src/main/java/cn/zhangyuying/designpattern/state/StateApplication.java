package cn.zhangyuying.designpattern.state;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StateApplication {

    public static void main(String[] args) {
        SpringApplication.run(StateApplication.class, args);
        MsgContext msgContext = new MsgContext();
        msgContext.handleState(MsgSendState.RETRY);
        msgContext.handleState(MsgSendState.SUCCESS);
        msgContext.handleState(MsgSendState.FAIL);
    }
}
