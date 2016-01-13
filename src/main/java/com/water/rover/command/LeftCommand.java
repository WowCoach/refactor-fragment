package com.water.rover.command;

import com.water.rover.location.Direction;
import com.water.rover.location.Location;

public class LeftCommand implements ICommand {

    @Override
    public Location execute(Location location) {
        Direction direction = location.getDirection().rotateAntiClockwise();
        return new Location(location.getPosition(), direction);
    }
}
