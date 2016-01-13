package com.water.rover.util;

import static com.water.rover.command.Command.L;
import static com.water.rover.command.Command.M;
import static com.water.rover.command.Command.R;

import java.util.HashMap;
import java.util.Map;

import com.water.rover.command.MoveCommand;
import com.water.rover.command.ICommand;
import com.water.rover.command.LeftCommand;
import com.water.rover.command.RightCommand;
import com.water.rover.command.Command;

public class CommandMapper {

    private static Map<Command, ICommand> commandMap = new HashMap<>();

    static {
        commandMap.put(M, new MoveCommand());
        commandMap.put(R, new RightCommand());
        commandMap.put(L, new LeftCommand());
    }

    public static ICommand getCommand(String command) {
        return commandMap.get(Command.valueOf(command));
    }
}
