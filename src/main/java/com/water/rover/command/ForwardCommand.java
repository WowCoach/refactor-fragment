package com.water.rover.command;

import com.water.rover.enumeration.Direction;
import com.water.rover.location.Location;
import com.water.rover.location.Position;

public class ForwardCommand implements ICommand {
    @Override
    public Location execute(Location location) {
        Direction direction = location.getDirection();
        Position position = location.getPosition();
        switch (direction) {
            case N:
                position.offsetY(1);
                break;
            case S:
                position.offsetY(-1);
                break;
            case E:
                position.offsetX(1);
                break;
            case W:
                position.offsetX(-1);
                break;
            default:
                break;
        }
        return new Location(position, direction);
    }
}
