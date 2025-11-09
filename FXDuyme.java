package com.example.javafxprojects;
import javafx.application.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
public class FXDuyme extends Application{
    public void start(Stage pStage){
        pStage.setTitle("Düymə");

        Button duyme = new Button("OK!");
        BorderPane pane = new BorderPane();

        /*
        VBox - şaquli vertikal
        HBox - üfüqi Horizontal
        BorderPane - ekranın hissələri ilə (top,bottom,left,right,center)
        GridPane - cədvəl şəklində
         */
        pane.setCenter(duyme);
        Scene s = new Scene(pane,400, 200);
        pStage.setScene(s);
        pStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}








































