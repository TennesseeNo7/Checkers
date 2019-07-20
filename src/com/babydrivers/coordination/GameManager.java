package com.babydrivers.coordination;

import com.babydrivers.gameobjects.Board;

public class GameManager {

    private Board board = new Board();

    public void initialize() {
        board.initialize();
    }

    public void reset() {
        board.reset();
    }

}
