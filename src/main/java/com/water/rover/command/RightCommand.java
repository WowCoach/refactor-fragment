package com.water.rover.command;

import static com.water.rover.command.LeftCommand.directions;

import com.water.rover.command.ICommand;
import com.water.rover.location.Direction;
import com.water.rover.location.Location;

public class RightCommand implements ICommand {

    @Override
    public Location execute(Location location) {
        Direction direction = directions.get((directions.indexOf(location.getDirection()) + 1) % directions.size());
        return new Location(location.getPosition(), direction);
    }
}
