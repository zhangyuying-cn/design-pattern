package cn.zhangyuying.designpattern.interpreter.impl;

import cn.zhangyuying.designpattern.interpreter.Expression;
import cn.zhangyuying.designpattern.interpreter.MessageContext;

/**
 * @author zyy.
 */
public class FacialExpression implements Expression {

    private MessageContext context;

    public FacialExpression(MessageContext context) {
        this.context = context;
    }

    @Override
    public String interpret() {
        return context.getFacial() + "表情";
    }

}

