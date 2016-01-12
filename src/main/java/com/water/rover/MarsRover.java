package com.water.rover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    public static final List<String> valid_commands = Arrays.asList("L", "R", "M");

    private Location location = new Location();

    public MarsRover(int startingX, int startingY, String direction) {
        this.location.setPosition(new Position(startingX, startingY));
        this.location.setDirection(Direction.valueOf(direction));
    }

    public String run(String input) {
        String[] commands = convertInputIntoCommands(input);

        for (String command : commands) {
            if (command.equals("M")) {
                move();
            } else if (command.equals("R")) {
                turnRight();
            } else if (command.equals("L")) {
                turnLeft();
            }
        }

        return asString();
    }

    private void move() {
        location.move();
    }

    private String asString() {
        return location.asString();
    }

    private void turnLeft() {
        location.turnLeft();
    }

    private void turnRight() {
        location.turnRight();
    }

    private static String[] convertInputIntoCommands(String input) {
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
