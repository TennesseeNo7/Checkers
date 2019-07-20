package com.babydrivers.gameobjects;

public abstract class Piece {

    public static final boolean WHITE = true;
    public static final boolean BLACK = false;

    protected boolean color;

    public Piece(boolean color) {
        this.color = color;
    }

    public boolean getColor() {
        return color;
    }

    public boolean isWhite() {
        return color;
    }

    public boolean isBlack() {
        return !color;
    }

}
