package ShipsGame.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class StartController {

    @FXML
    private GameGUIController gameGUIController;

    @FXML
    private Pane gameView;


    @FXML
    void initialize() {

    }

    public void startGame(ActionEvent actionEvent) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gameGUI.fxml"));


        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();

        stage.setTitle("Gra w statki");
        stage.setScene(new Scene(root1));
        stage.show();


    }


}
