package cn.zhangyuying.designpattern.mediator;

import cn.zhangyuying.designpattern.mediator.impl.CleanColleague;
import cn.zhangyuying.designpattern.mediator.impl.FinanceColleague;
import cn.zhangyuying.designpattern.mediator.impl.MaintainColleague;
import cn.zhangyuying.designpattern.mediator.impl.MessageMediator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MediatorApplication {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(MediatorApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MediatorApplication.class, args);

        financeNotice();
        maintainNotice();
        cleanNotice();

    }

    private static void cleanNotice() {
        logger.info("清洁部门发送消息：");
        Colleague cleanColleague = new CleanColleague(new MessageMediator());
        String cleanMessage = "清洁通知：本周六对公司进行清洁！";
        cleanColleague.sendMessage(cleanMessage);
    }

    private static void maintainNotice() {
        logger.info("运维部门发送消息：");
        Colleague maintainColleague = new MaintainColleague(new MessageMediator());
        String maintainMessage = "运维通知：今晚6点对公司系统进行维护！";
        maintainColleague.sendMessage(maintainMessage);
    }

    private static void financeNotice() {
        logger.info("财务部门发送消息：");
        Colleague financeColleague = new FinanceColleague(new MessageMediator());
        String financeMessage = "财务通知：今晚5点可统一报销！";
        financeColleague.sendMessage(financeMessage);
    }

}

