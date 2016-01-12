package com.water.rover;

import static com.water.rover.Direction.*;

import java.util.Arrays;
import java.util.List;

public class Location {
    private Direction direction;
    private Position position;
    public static final List<Direction> directions = Arrays.asList(N, E, S, W);

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String asString() {
        return position.getX()+ " " + position.getY()+ " " + direction.name();
    }

    public void turnLeft() {
        direction = directions.get((directions.indexOf(direction) + 3) % directions.size());
    }

    public void turnRight() {
        direction = directions.get((directions.indexOf(direction) + 1) % directions.size());
    }
}
