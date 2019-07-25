package ShipsGame.controller;

import javafx.event.ActionEvent;

public class RootController {


    public void buttonAction(ActionEvent actionEvent){
        String s = actionEvent.getSource().toString();
        char row = s.charAt(11);
        char collumn = s.charAt(12);
        System.out.println(actionEvent.getSource().toString());
        System.out.println("Row:" +row + " Collumn: " + collumn);
        //todo method call
    }

}
