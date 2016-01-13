package com.water.rover.command;

import static com.water.rover.location.Direction.*;

import java.util.HashMap;
import java.util.Map;

import com.water.rover.location.Direction;
import com.water.rover.location.Location;
import com.water.rover.location.Point;

public class MoveCommand implements ICommand {

    private static Map<Direction, Point> forwardMap = new HashMap<Direction, Point>() {{
        put(N, new Point(0, 1));
        put(S, new Point(0, -1));
        put(E, new Point(1, 0));
        put(W, new Point(-1, 0));
    }};

    @Override
    public Location execute(Location location) {
        Direction direction = location.getDirection();
        Point position = location.getPosition();
        position.offset(forwardMap.get(direction));
        return new Location(position, direction);
    }
}
