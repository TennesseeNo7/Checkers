package com.babydrivers.gameobjects;

import javafx.scene.control.Button;

public class Field extends Button implements Initializable {

    private Piece piece = null;

    private int x;
    private int y;

    public Field(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void initialize() {
        if(y < 2) {
            piece = new Man(Piece.WHITE);
        } else if(y > 5) {
            piece = new Man(Piece.BLACK);
        }
    }

    @Override
    public void reset() {
        //TODO
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece p) {
        piece = p;
    }
}
