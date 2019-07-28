package ShipsGame.controller;

import com.sun.javafx.geom.Vec4f;
import com.sun.xml.internal.bind.XmlAccessorFactory;
import com.sun.xml.internal.bind.v2.TODO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class GameGUIController {

    @FXML
    private TextArea instructionField;

    @FXML
    private Label playerShotMapLabel, playerShipsMapLabel;

    @FXML
    private TextField task;

    @FXML
    private VBox V0ShotBoard, V1ShotBoard, V2ShotBoard, V3ShotBoard, V4ShotBoard, V5ShotBoard, V6ShotBoard, V7ShotBoard, V8ShotBoard, V9ShotBoard;

    @FXML
    private Button Confirm;

    @FXML
    private VBox shotBoardVLabels;

    @FXML
    private HBox shotBoardHLabels;


    @FXML
    void initialize() {

        fillStageConfView(false);
    }

    public void fillStageConfView(boolean flag) {

        playerShotMapLabel.setVisible(flag);
        V0ShotBoard.setVisible(flag);
        V1ShotBoard.setVisible(flag);
        V2ShotBoard.setVisible(flag);
        V3ShotBoard.setVisible(flag);
        V4ShotBoard.setVisible(flag);
        V5ShotBoard.setVisible(flag);
        V6ShotBoard.setVisible(flag);
        V7ShotBoard.setVisible(flag);
        V8ShotBoard.setVisible(flag);
        V9ShotBoard.setVisible(flag);
        task.setVisible(flag);
        shotBoardVLabels.setVisible(flag);
        shotBoardHLabels.setVisible(flag);

        instructionField.setVisible(!flag);

    }

    public void confirmAction(ActionEvent actionEvent) {

        //TODO
        //sprawdzanie poprawności wypełnienia planszy

        fillStageConfView(true);

    }


    public void putMast(ActionEvent actionEvent) {
        //TODO
        //stawiania masztu

    }

    public void shot(ActionEvent actionEvent) {
        //TODO
        //strzelanie do statków przeciwnika



    }


}
