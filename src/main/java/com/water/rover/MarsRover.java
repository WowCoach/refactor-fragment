package com.water.rover;

import static com.water.rover.CommandConverter.*;

public class MarsRover {

    private Location location;

    public MarsRover(int startingX, int startingY, String direction) {
        location = new Location(new Position(startingX, startingY), Direction.valueOf(direction));
    }

    public String run(String input) {
        String[] commands = convertInputIntoCommands(input);

        for (String command : commands) {
            if (command.equals("M")) {
                location.move();
            } else if (command.equals("R")) {
                location.turnRight();
            } else if (command.equals("L")) {
                location.turnLeft();
            }
        }

        return asString();
    }

    private String asString() {
        return location.asString();
    }

}
