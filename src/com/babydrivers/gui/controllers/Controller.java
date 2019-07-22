package com.babydrivers.gui.controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
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

        //TODO Scalable board

        //gridPane.setStyle("-fx-background-image: url{/rsc/black.png}");
        int padding = 11;
        gridPane.setPadding(new Insets(padding,padding,padding,padding));

        BackgroundSize size = new BackgroundSize(50, 50, false, false, true, true);

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

                tmp.setId(i+"x"+j);

                tmp.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        System.out.println(tmp.getId());
                    }
                });

                buttonArray[i][j] = tmp;
                gridPane.add(tmp,pos,i);
                pos+=2;

            }
        }


        BackgroundImage black = new BackgroundImage(new Image(getClass().getResource("/rsc/black.png").toExternalForm()),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
        Background blackBackground = new Background(black);

        for(int i=0; i<3; i++){
            for(int j=0;j<buttonArray[i].length; j++){
                buttonArray[i][j].setBackground(blackBackground);
            }
        }

        BackgroundImage white = new BackgroundImage(new Image(getClass().getResource("/rsc/white.png").toExternalForm()),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
        Background whiteBackground = new Background(white);

        for(int i=7; i>4; i--){
            for(int j=0;j<buttonArray[i].length; j++){
                buttonArray[i][j].setBackground(whiteBackground);
            }
        }

        BackgroundImage empty = new BackgroundImage(new Image(getClass().getResource("/rsc/empty_field.png").toExternalForm()),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, size);
        Background emptyBackground = new Background(empty);

        for(int i=3; i<5; i++){
            for(int j=0; j<buttonArray[i].length; j++){
                buttonArray[i][j].setBackground(emptyBackground);
            }
        }


    }


}
