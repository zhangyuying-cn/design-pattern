package cn.zhangyuying.designpattern.decorator.impl;

import cn.zhangyuying.designpattern.decorator.Food;

/**
 * @author zyy.
 */
public class Decorator extends Food {

    protected Food food;

    public Decorator(Food food) {
        this.food = food;
    }

    @Override
    public double price() {
        return food.price();
    }

    @Override
    public String match(){
        return "米饭";
    }
}
