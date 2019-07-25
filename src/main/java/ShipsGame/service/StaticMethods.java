package pl.sda.ships_skeleton.controller;

import pl.sda.ships_skeleton.model.Lists;
import pl.sda.ships_skeleton.model.Mast;

import java.util.List;

public class StaticMethods {
    public static void addMastToList(Mast mast, List<Mast> list){
        list.add(mast);
    }
}
