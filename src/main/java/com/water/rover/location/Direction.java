package com.water.rover.location;

public enum Direction {
    N("North", 0),
    E("East", 1),
    S("South", 2),
    W("West", 3);

    private static final int CLOCKWISE_STEP = 1;
    private static final int ANTI_CLOCKWISE_STEP = 3;

    private String value;
    private int index;

    Direction(String value, int index) {
        this.value = value;
        this.index = index;
    }

    public Direction rotateClockwise() {
        return values()[(index + CLOCKWISE_STEP) % values().length];
    }


    public Direction rotateAntiClockwise() {
        return values()[(index + ANTI_CLOCKWISE_STEP) % values().length];
    }
}
