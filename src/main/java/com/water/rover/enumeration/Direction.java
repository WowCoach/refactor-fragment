package com.water.rover.enumeration;

public enum Direction {
    N("North", 0),
    E("East", 1),
    S("South", 2),
    W("West", 3);

    private String value;
    private int index;

    Direction(String value, int index) {
        this.value = value;
        this.index = index;
    }

    public Direction rotateClockwise() {
        Direction[] directions = Direction.values();
        return directions[(index + 1) % directions.length];
    }


    public Direction rotateAntiClockwise() {
        Direction[] directions = Direction.values();
        return directions[(index + 3) % directions.length];
    }
}
