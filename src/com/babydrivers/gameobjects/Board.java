package com.babydrivers.gameobjects;

public class Board implements Initializable {

    private Field[][] fields;

    public Board() {
        fields = new Field[8][8];
        //... initialize fields
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                fields[i][j] = new Field(i, j); //EXAMPLE TODO
            }
        }
    }

    @Override
    public void initialize() {
        for(Field[] temp: fields) {
            for(Field f: temp) {
                f.initialize();
            }
        }
    }

    @Override
    public void reset() {
        for(Field[] temp: fields) {
            for(Field f: temp) {
                f.reset();
            }
        }
    }

    public Field getField(int x, int y) {
        return null; //TODO
    }

}
