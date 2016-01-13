package com.water.rover.location;

public class Location {
    private Direction direction;
    private Point position;

    public Location(Point position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public String asString() {
        return position.getX()+ " " + position.getY()+ " " + direction.name();
    }

    public Direction getDirection() {
        return direction;
    }

    public Point getPosition() {
        return position;
    }
}
