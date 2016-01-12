package com.water.rover.util;

import static com.water.rover.enumeration.Command.L;
import static com.water.rover.enumeration.Command.M;
import static com.water.rover.enumeration.Command.R;
import static java.util.Arrays.asList;

import java.util.List;

public class CommandLoader {
    private static final List<String> VALID_COMMANDS = asList(L.name(), R.name(), M.name());

    public static String[] convertInputIntoCommands(String input) {
        String[] commandArray = input.split("(?!^)");

        validateCommands(input, commandArray);

        return commandArray;
    }

    private static void validateCommands(String input, String[] commandArray) {
        for (String command : commandArray) {
            if (!VALID_COMMANDS.contains(command)) {
                throw new IllegalArgumentException("Invalid command sequence: " + input);
            }
        }
    }
}
