package com.water.rover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    public static final List<String> valid_commands = Arrays.asList("L", "R", "M");
    public static final List<String> directions = Arrays.asList("N", "E", "S", "W");

    public static final int Y = 1;
    public static final int X = 0;

    private String direction;
    private int[] position;

    public MarsRover(int startingX, int startingY, String direction) {
        this.position = new int[]{startingX, startingY};
        this.direction = direction;
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
        switch (direction) {
            case "N":
                position[Y] += +1; break;
            case "S":
                position[Y] += -1; break;
            case "E":
                position[X] += +1; break;
            case "W":
                position[X] += -1; break;
            default: break;
        }
    }

    private String asString() {
        return position[X] + " " + position[Y] + " " + direction;
    }

    private void turnLeft() {
        direction = directions.get((directions.indexOf(direction) + 3) % directions.size());
    }

    private void turnRight() {
        direction = directions.get((directions.indexOf(direction) + 1) % directions.size());
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
