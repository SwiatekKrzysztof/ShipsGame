package ShipsGame.model;


import ShipsGame.service.StaticMethods;

import java.util.List;

public class Mast {
    private int column;
    private int row;
    private int type;
    private int number;
    private boolean destroyed;

    public Mast(int column, int row, int type, int number, List<Mast> masts) { //regular mast
        this.column = column;
        this.row = row;
        this.type = type;
        this.number = number;
        StaticMethods.addMastToList(this, masts); //whenever we create mast we add it to the appropriate list
    }

    public Mast(int column, int row,List<Mast> shots) { //shots made by player
        this.column = column;
        this.row = row;
        StaticMethods.addMastToList(this, shots); //whenever player shoots we save it in the appropriate list(shots)
    }

    @Override
    public String toString() {
        return "Mast{" +
                "column=" + column +
                ", row=" + row +
                ", type=" + type +
                ", number=" + number +
                ", destroyed=" + destroyed +
                '}';
    }
}
