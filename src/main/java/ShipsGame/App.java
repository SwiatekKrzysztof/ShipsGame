package ShipsGame;

import ShipsGame.controller.GameGUIController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class App extends Application {

    protected Parent root;
    private Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //stage = primaryStage;
        stage = primaryStage;
        root = FXMLLoader.load(
                getClass()
                        .getResource("/start.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Gra w statki");
        primaryStage.show();



       // gamePage();

    }

//    public void gamePage() throws Exception {
//
//        root = FXMLLoader.load(getClass().getResource("/gameGUI.fxml"));
//
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//
//        stage.show();
//
//
//    }

}
