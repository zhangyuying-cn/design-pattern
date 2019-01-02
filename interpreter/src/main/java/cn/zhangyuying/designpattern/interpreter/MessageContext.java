package cn.zhangyuying.designpattern.interpreter;

import cn.zhangyuying.designpattern.interpreter.impl.BoldExpression;
import cn.zhangyuying.designpattern.interpreter.impl.ItalicExpression;
import cn.zhangyuying.designpattern.interpreter.impl.UrlExpression;

/**
 * @author zyy.
 */
public class MessageContext {

    private String facial;

    MessageContext(String facial) {
        this.facial = facial;
    }


    public String getFacial() {
        return facial;
    }

    public void setFacial(String facial) {
        this.facial = facial;
    }

}
