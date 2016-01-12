package com.water.rover.location;

public class Location {
    private Direction direction;
    private Position position;

    public Location(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public String asString() {
        return position.getX()+ " " + position.getY()+ " " + direction.name();
    }

    public Direction getDirection() {
        return direction;
    }

    public Position getPosition() {
        return position;
    }
}
