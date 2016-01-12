package com.water.rover;

import static com.water.rover.util.CommandLoader.convertInputIntoCommands;
import static com.water.rover.util.CommandMapper.getCommand;
import static java.util.Arrays.stream;

import com.water.rover.location.Direction;
import com.water.rover.location.Location;
import com.water.rover.location.Position;

public class MarsRover {

    private Location location;

    public MarsRover(int startingX, int startingY, String direction) {
        location = new Location(new Position(startingX, startingY), Direction.valueOf(direction));
    }

    public String run(String input) {
        stream(convertInputIntoCommands(input)).forEach(command ->
                location = getCommand(command).execute(location));
        return location.asString();
    }

}
