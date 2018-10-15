package cn.zhangyuying.designpattern.command;

import cn.zhangyuying.designpattern.command.bean.TVOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zyy.
 */
public class RemoteControl {

    Map<TVOperation, Command> commandMap = new HashMap<>();

    public void addCommand(TVOperation operation, Command command) {
        commandMap.put(operation, command);
    }

    public void commandExecute(TVOperation operation) {
        if (commandMap.get(operation) == null) {
            throw new IllegalArgumentException("遥控器不存在此命令！");
        }
        commandMap.get(operation).execute();
    }

}
