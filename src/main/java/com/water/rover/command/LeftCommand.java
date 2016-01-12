package com.water.rover.command;

import static com.water.rover.enumeration.Direction.E;
import static com.water.rover.enumeration.Direction.N;
import static com.water.rover.enumeration.Direction.S;
import static com.water.rover.enumeration.Direction.W;

import java.util.Arrays;
import java.util.List;

import com.water.rover.enumeration.Direction;
import com.water.rover.location.Location;

public class LeftCommand implements ICommand {
    public static final List<Direction> directions = Arrays.asList(N, E, S, W);

    @Override
    public Location execute(Location location) {
        Direction direction = directions.get((directions.indexOf(location.getDirection()) +  3) % directions.size());
        return new Location(location.getPosition(), direction);
    }
}
