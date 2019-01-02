package cn.zhangyuying.designpattern.interpreter.impl;

import cn.zhangyuying.designpattern.interpreter.Expression;
import cn.zhangyuying.designpattern.interpreter.SymbolContants;

/**
 * @author zyy.
 */
public class ItalicExpression implements Expression {

    private String message;

    public ItalicExpression(String message) {
        this.message = message;
    }

    @Override
    public String interpret() {
        if (!message.contains(SymbolContants.COLON)) {
            return message;
        }
        String[] messageList = message.split(SymbolContants.COLON);
        if (!messageList[0].equalsIgnoreCase(SymbolContants.ITALIC)) {
            return message;
        }
        return String.format(SymbolContants.ITALIC_FORMAT, messageList[1]);
    }

}
