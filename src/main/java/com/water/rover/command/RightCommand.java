package com.water.rover.command;

import com.water.rover.location.Direction;
import com.water.rover.location.Location;

public class RightCommand implements ICommand {

    @Override
    public Location execute(Location location) {
        Direction direction = location.getDirection().rotateClockwise();
        return new Location(location.getPosition(), direction);
    }
}
