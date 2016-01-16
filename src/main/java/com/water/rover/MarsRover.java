package com.water.rover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    // The valid commands (turn left, turn right, move)
    public static final List<String> valid_commands = Arrays.asList("L", "R", "M");
    // The four directions (North, East, South, West)
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
            switch (command) {
                case "M":
                    move(); // If the command is M, then move

                    break;
                case "R":
                    turnRight(); // If the command is R, then turn Right

                    break;
                case "L":
                    turnLeft(); // If the command is L, then turn Left

                    break;
            }
        }

        return positionDirection();
    }

    private void move() {
        switch (direction) {
            case "N": // If the direction is North
                position[Y] += +1; break;
            case "S": // If the direction is South
                position[Y] += -1; break;
            case "E": // If the direction is East
                position[X] += +1; break;
            case "W": // If the direction West
                position[X] += -1; break;
            default: break;
        }
    }

    private String positionDirection() {
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
