package cn.zhangyuying.designpattern.interpreter;

import cn.zhangyuying.designpattern.interpreter.impl.BoldExpression;
import cn.zhangyuying.designpattern.interpreter.impl.FacialExpression;
import cn.zhangyuying.designpattern.interpreter.impl.ItalicExpression;
import cn.zhangyuying.designpattern.interpreter.impl.UrlExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class InterpreterApplication {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(InterpreterApplication.class);

    private static String regex = "(\\([^\\)]*\\))";

    private static Pattern pattern = Pattern.compile(regex);

    public static void main(String[] args) {
        SpringApplication.run(InterpreterApplication.class, args);
        String message = "您在本次(I:幸运转转)的抽奖活动中，被抽中为(B:幸运观众)，并且已获得(B:二等奖),请登录(url:http://zhangyuying.cn)领取。";
        List<String> convertMessage = extractMessageByRegular(message);
        for (String convertMsg : convertMessage) {
            Expression expression = symbolFactory(convertMsg);
            String interpretMessage = expression.interpret();
            message = message.replace(String.format(SymbolContants.BRACKETS_FORMAT, convertMsg), interpretMessage);
        }
        MessageContext context = new MessageContext("撒花");
        message += new FacialExpression(context).interpret();
        logger.info(message);
    }

    private static List<String> extractMessageByRegular(String msg) {
        List<String> list = new ArrayList<>();
        Matcher m = pattern.matcher(msg);
        while (m.find()) {
            list.add(m.group().substring(1, m.group().length() - 1));
        }
        return list;
    }

    private static Expression symbolFactory(String convertMsg) {
        String symbol = convertMsg.substring(0, convertMsg.indexOf(SymbolContants.COLON));
        switch (symbol) {
            case "I":
                return new ItalicExpression(convertMsg);
            case "B":
                return new BoldExpression(convertMsg);
            case "url":
                return new UrlExpression(convertMsg);
            default:
                throw new IllegalArgumentException("不支持的特殊符号:" + symbol);
        }
    }

}

