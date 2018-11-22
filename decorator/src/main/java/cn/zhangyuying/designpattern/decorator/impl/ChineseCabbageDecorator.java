package cn.zhangyuying.designpattern.decorator.impl;

import cn.zhangyuying.designpattern.decorator.Food;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class ChineseCabbageDecorator extends Decorator {

    public ChineseCabbageDecorator(Food food) {
        super(food);
    }

    @Override
    public double price() {
        return food.price() + 12;
    }

    @Override
    public String match() {
        return food.match() + "+小白菜";
    }
}
