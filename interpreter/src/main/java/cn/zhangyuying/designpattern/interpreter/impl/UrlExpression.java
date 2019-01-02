package cn.zhangyuying.designpattern.interpreter.impl;

import cn.zhangyuying.designpattern.interpreter.Expression;
import cn.zhangyuying.designpattern.interpreter.SymbolContants;

/**
 * @author zyy.
 */
public class UrlExpression implements Expression {

    private String message;

    public UrlExpression(String message) {
        this.message = message;
    }

    @Override
    public String interpret() {
        if (!message.contains(SymbolContants.COLON)) {
            return message;
        }
        String[] messageList = message.split(SymbolContants.COLON);
        if (!messageList[0].equalsIgnoreCase(SymbolContants.URL)) {
            return message;
        }
        return String.format(SymbolContants.URL_FORMAT, messageList[1] + messageList[2]);
    }

}
