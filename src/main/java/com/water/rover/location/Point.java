package com.water.rover.location;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void offset(Point vector) {
        this.x += vector.x;
        this.y += vector.y;
    }
}
