package cn.zhangyuying.designpattern.decorator;

import cn.zhangyuying.designpattern.decorator.impl.Rice;
import cn.zhangyuying.designpattern.decorator.impl.SpicyPorkDecorator;
import cn.zhangyuying.designpattern.decorator.impl.ChineseCabbageDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(DecoratorApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DecoratorApplication.class, args);
        Food food = new ChineseCabbageDecorator(new SpicyPorkDecorator(new Rice()));
        logger.info("菜单的搭配为："+food.match());
        logger.info("当前搭配的价钱为："+food.price());
        Food food2 = new ChineseCabbageDecorator((new Rice()));
        logger.info("菜单的搭配为："+food2.match());
        logger.info("当前搭配的价钱为："+food2.price());
    }
}
