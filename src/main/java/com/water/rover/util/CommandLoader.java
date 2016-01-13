package com.water.rover.util;

import static com.water.rover.command.Command.L;
import static com.water.rover.command.Command.M;
import static com.water.rover.command.Command.R;
import static java.util.Arrays.asList;
import static java.util.Arrays.stream;

import java.util.List;

public class CommandLoader {
    private static final List<String> VALID_COMMANDS = asList(L.name(), R.name(), M.name());
    private static final String REGEX = "(?!^)";

    public static String[] convertInputIntoCommands(String input) {
        String[] commandArray = input.split(REGEX);

        validateCommands(input, commandArray);

        return commandArray;
    }

    private static void validateCommands(String input, String[] commandArray) {
        if (stream(commandArray).anyMatch(command -> !VALID_COMMANDS.contains(command))) {
            throw new IllegalArgumentException("Invalid command sequence: " + input);
        }
    }
}
