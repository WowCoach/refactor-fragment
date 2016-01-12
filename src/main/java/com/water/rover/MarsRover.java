package com.water.rover;

import static com.water.rover.util.LoadCommandUtil.convertInputIntoCommands;

import com.water.rover.command.ForwardCommand;
import com.water.rover.command.LeftCommand;
import com.water.rover.command.RightCommand;
import com.water.rover.location.Direction;
import com.water.rover.location.Location;
import com.water.rover.location.Position;

public class MarsRover {

    private Location location;

    public MarsRover(int startingX, int startingY, String direction) {
        location = new Location(new Position(startingX, startingY), Direction.valueOf(direction));
    }

    public String run(String input) {
        String[] commands = convertInputIntoCommands(input);

        for (String command : commands) {
            if (command.equals("M")) {
                location = new ForwardCommand().execute(location);
            } else if (command.equals("R")) {
                location = new RightCommand().execute(location);
            } else if (command.equals("L")) {
                location = new LeftCommand().execute(location);
            }
        }

        return asString();
    }

    private String asString() {
        return location.asString();
    }

}
