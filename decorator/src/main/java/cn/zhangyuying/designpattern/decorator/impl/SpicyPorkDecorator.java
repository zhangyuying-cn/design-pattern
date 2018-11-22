package cn.zhangyuying.designpattern.decorator.impl;

import cn.zhangyuying.designpattern.decorator.Food;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class SpicyPorkDecorator extends Decorator {

    public SpicyPorkDecorator(Food message) {
        super(message);
    }

    @Override
    public double price() {
        return food.price() + 18;
    }

    @Override
    public String match() {
        return food.match()+"+香辣肉丝";
    }
}
