package ShipsGame.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ComputerBoardService {

    private boolean[][] computerBoard = new boolean[12][12];

    public void boardFilling() {

        shipInsert(4);
        shipInsert(3);

        printBoard();

    }

    public void printBoard() {

        for (int i = 0; i < computerBoard.length; i++) {
            for (int j = 0; j < computerBoard.length; j++) {
                if (computerBoard[i][j] == true) {
                    System.out.print("X ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    private void shipInsert(int shipSize) {

        List<Integer> freeSpaces = new LinkedList<>();
        boolean axis = false;
        int index = 0;
        int topMastIndex;


        while (freeSpaces.size() == 0) {

            axis = axisRandom();
            index = indexRandom();
            freeSpaces = findFreeSpaces(axis, index, shipSize);

        }

        topMastIndex = topMastRandom(freeSpaces);
        //insertShipIntoMastList(shipSize, axis, index, topMastIndex);
        insertShipIntoBoard(shipSize, axis, index, topMastIndex);

        System.out.println(shipSize + " " + axis + " " + index + " " + topMastIndex + "    " + freeSpaces.toString());

    }

    public boolean axisRandom() {

        Random random = new Random();
        return random.nextBoolean();

    }

    public int indexRandom() {

        Random random = new Random();
        return random.nextInt(10) + 1;


    }

    public int topMastRandom(List<Integer> freespace) {
        Random random = new Random();
        int index = random.nextInt(freespace.size());
        return freespace.get(index);

    }

    public List<Integer> findFreeSpaces(boolean axis, int index, int shipSize) {

        List<Integer> freeSpace = new LinkedList<>();

        //boolean[] tab = new boolean[]{false, false, false, false, true, false, false, false, false, true};
        boolean result = false;

        if (axis) {             // true - horizontal

            for (int i = 1; i < 12 - shipSize; i++) {
                if (!computerBoard[index][i]) {
                    for (int j = i; j < i + shipSize; j++) {
                        if (computerBoard[index][j]) {
                            result = true;

                        }
                    }
                    if (!result) {
                        freeSpace.add(i);

                    }
                    result = false;
                }

            }
        } else {                // false = vertical

            for (int i = 1; i < 12 - shipSize; i++) {
                if (!computerBoard[i][index]) {
                    for (int j = i; j < i + shipSize; j++) {
                        if (computerBoard[j][index]) {
                            result = true;

                        }
                    }
                    if (!result) {
                        freeSpace.add(i);
                    }
                    result = false;
                }

            }
        }

        return freeSpace;

    }

    public void insertShipIntoBoard(int shipSize, boolean axis, int index, int topMastIndex) {

        if (axis) {  // horizontal

            for (int i = topMastIndex; i < topMastIndex + shipSize; i++) {

                if (i == topMastIndex) {
                    computerBoard[index][i - 1] = true;
                }
                computerBoard[index][i] = true;
                computerBoard[index - 1][i] = true;
                computerBoard[index - 1][i - 1] = true;
                computerBoard[index - 1][i + 1] = true;
                computerBoard[index + 1][i - 1] = true;
                computerBoard[index + 1][i + 1] = true;
                if (i == topMastIndex + shipSize - 1) {
                    computerBoard[index][i + 1] = true;
                }

            }
            if (shipSize == 1) {
                computerBoard[index][topMastIndex - 1] = true;
                computerBoard[index][topMastIndex + 1] = true;
            }

        } else {            //vertical

            for (int i = topMastIndex; i < topMastIndex + shipSize; i++) {

                if (i == topMastIndex) {
                    computerBoard[i - 1][index] = true;
                }
                computerBoard[i][index] = true;
                computerBoard[i][index - 1] = true;
                computerBoard[i - 1][index - 1] = true;
                computerBoard[i + 1][index - 1] = true;
                computerBoard[i - 1][index + 1] = true;
                computerBoard[i + 1][index + 1] = true;

                if (i == topMastIndex + shipSize - 1) {
                    computerBoard[i + 1][index] = true;
                }

            }

            if (shipSize == 1) {
                computerBoard[topMastIndex - 1][index] = true;
                computerBoard[topMastIndex + 1][index] = true;
            }

        }

    }

}
