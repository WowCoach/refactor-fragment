package com.water.rover.command;

public enum Command {
    L("Left"),
    R("Right"),
    M("Move");

    private String value;

    Command(String value) {

        this.value = value;
    }
}
