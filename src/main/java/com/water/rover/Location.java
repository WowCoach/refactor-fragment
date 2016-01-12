package com.water.rover;

import static com.water.rover.Direction.*;

import java.util.Arrays;
import java.util.List;

public class Location {
    private Direction direction;
    private Position position;
    public static final List<Direction> directions = Arrays.asList(N, E, S, W);

    public Location(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
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

    public void move() {
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
    }
}
