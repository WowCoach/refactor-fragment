package com.water.rover.location;

public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void offsetY(int value) {
        y += value;
    }

    public void offsetX(int value) {
        x += value;
    }
}
