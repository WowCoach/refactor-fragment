package com.water.rover.util;

import java.util.HashMap;
import java.util.Map;

import com.water.rover.command.ForwardCommand;
import com.water.rover.command.ICommand;
import com.water.rover.command.LeftCommand;
import com.water.rover.command.RightCommand;

public class CommandMapper {
    private static final String MOVE_COMMAND = "M";
    private static final String TURN_RIGHT_COMMAND = "R";
    private static final String TURN_LEFT_COMMAND = "L";

    private static Map<String, ICommand> commandMap = new HashMap<String, ICommand>() {
        {
            put(MOVE_COMMAND, new ForwardCommand());
            put(TURN_RIGHT_COMMAND, new RightCommand());
            put(TURN_LEFT_COMMAND, new LeftCommand());
        }
    };

    public static ICommand getCommand(String command) {
        return commandMap.get(command);
    }
}
