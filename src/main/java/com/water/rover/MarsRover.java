package com.water.rover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    // The valid commands (turn left, turn right, move)
    public static final List<Orientation> VALID_COMMANDS = Arrays.asList(Orientation.L, Orientation.R, Orientation.M);
    // The four directions (North, East, South, West)
    public static final List<String> DIRECTIONS = Arrays.asList("N", "E", "S", "W");

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

        excute(commands);

        return positionDirectionAsString();
    }

    private void excute(String[] commands) {
        for (String command : commands) {
            Orientation orientation = Orientation.valueOf(command);
            switch (orientation) {
                case M:
                    move(); // If the command is M, then move

                    break;
                case R:
                    turnRight(); // If the command is R, then turn Right

                    break;
                case L:
                    turnLeft(); // If the command is L, then turn Left

                    break;
            }
        }
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

    private String positionDirectionAsString() {
        return position[X] + " " + position[Y] + " " + direction;
    }

    private void turnLeft() {
        direction = DIRECTIONS.get((DIRECTIONS.indexOf(direction) + 3) % DIRECTIONS.size());
    }

    private void turnRight() {
        direction = DIRECTIONS.get((DIRECTIONS.indexOf(direction) + 1) % DIRECTIONS.size());
    }

    private static String[] convertInputIntoCommands(String input) {
        String[] commandArray = input.split("(?!^)");

        validateCommands(input, commandArray);

        return commandArray;
    }

    private static void validateCommands(String input, String[] commandArray) {
        for (String command : commandArray) {
            if (!VALID_COMMANDS.contains(Orientation.valueOf(command))) {
                throw new IllegalArgumentException("Invalid command sequence: " + input);
            }
        }
    }

}
