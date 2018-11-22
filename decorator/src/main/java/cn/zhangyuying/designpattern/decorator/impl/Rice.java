package cn.zhangyuying.designpattern.decorator.impl;

import cn.zhangyuying.designpattern.decorator.Food;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class Rice extends Food {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(Rice.class);

    @Override
    public double price() {
        return 2;
    }

    @Override
    public String match() {
        return "米饭";
    }
}
