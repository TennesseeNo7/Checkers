package com.babydrivers.gui.controllers;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class Controller {

    @FXML
    private GridPane gridPane;

    Button[][] buttonArray = new Button[8][4];
    public void initialize(){

        //gridPane.setStyle("-fx-background-image: url{/rsc/black.png}");
        int padding = 8;
        gridPane.setPadding(new Insets(padding,padding,padding,padding));

        BackgroundImage backgroundImage = new BackgroundImage(new Image(getClass().getResource("/rsc/board.png").toExternalForm()),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        gridPane.setBackground(background);


        int pos;
        for(int i =0; i<buttonArray.length; i++){
            if(i%2==0)
                pos = 1;
            else
                pos = 0;
            for(int j =0; j<buttonArray[i].length; j++){
                Button tmp = new Button();
                tmp.setPrefHeight(75);
                tmp.setPrefWidth(75);


                buttonArray[i][j] = tmp;
                gridPane.add(tmp,pos,i);
                pos+=2;

            }
        }

        BackgroundImage black = new BackgroundImage(new Image(getClass().getResource("/rsc/black.png").toExternalForm()),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background blackBackground = new Background(black);

        for(int i=0; i<3; i++){
            for(int j=0;j<buttonArray[i].length; j++){
                buttonArray[i][j].setBackground(blackBackground);
            }
        }

        BackgroundImage white = new BackgroundImage(new Image(getClass().getResource("/rsc/white.png").toExternalForm()),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background whiteBackground = new Background(white);

        for(int i=7; i>4; i--){
            for(int j=0;j<buttonArray[i].length; j++){
                buttonArray[i][j].setBackground(whiteBackground);
            }
        }

    }
}
