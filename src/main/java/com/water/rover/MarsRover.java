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

    private String d; // direction
    private int[] p; // position

    public MarsRover(int startingX, int startingY, String d) {
        this.p = new int[]{startingX, startingY};
        this.d = d;
    }

    public String run(String input) {
        String[] commands = convertInputIntoCommands(input);

        for (String command : commands) {
            if (command.equals("M")) {
                move(); // If the command is M, then move
            } else if (command.equals("R")) {
                turnRight(); // If the command is R, then turn Right
            } else if (command.equals("L")) {
                turnLeft(); // If the command is L, then turn Left
            }
        }

        return asString();
    }

    private void move() {
        switch (d) {
            case "N": // If the direction is North
                p[Y] += +1; break;
            case "S": // If the direction is South
                p[Y] += -1; break;
            case "E": // If the direction is East
                p[X] += +1; break;
            case "W": // If the direction West
                p[X] += -1; break;
            default: break;
        }
    }

    private String asString() {
        return p[X] + " " + p[Y] + " " + d;
    }

    private void turnLeft() {
        d = directions.get((directions.indexOf(d) + 3) % directions.size());
    }

    private void turnRight() {
        d = directions.get((directions.indexOf(d) + 1) % directions.size());
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
