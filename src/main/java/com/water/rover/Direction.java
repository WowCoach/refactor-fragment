package com.water.rover;

public enum Direction {
    E("East"),
    W("West"),
    S("South"),
    N("North");

    private String value;

    Direction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
