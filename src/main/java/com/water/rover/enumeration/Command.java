package com.water.rover.enumeration;

public enum Command {
    L("Left"),
    R("Right"),
    M("Move");

    private String value;

    Command(String value) {

        this.value = value;
    }
}
