package com.water.rover.util;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

import com.water.rover.command.Command;

public class CommandLoader {
    private static final String SPLIT_COMMAND_REGEX = "(?!^)";

    public static List<Command> convertInputIntoCommands(String input) {
        return Arrays.stream(input.split(SPLIT_COMMAND_REGEX)).map(Command::valueOf).collect(toList());
    }

}
