package com.water.rover.util;

import java.util.Arrays;
import java.util.List;

public class LoadCommandUtil {
    public static final List<String> valid_commands = Arrays.asList("L", "R", "M");

    public static String[] convertInputIntoCommands(String input) {
        String[] commandArray = input.split("(?!^)");

        validateCommands(input, commandArray);

        return commandArray;
    }

    private static void validateCommands(String input, String[] commandArray) {
        for (String command : commandArray) {
            if (!valid_commands.contains(command)) {
                throw new IllegalArgumentException("Invalid command sequence: " + input);
            }
        }
    }
}
