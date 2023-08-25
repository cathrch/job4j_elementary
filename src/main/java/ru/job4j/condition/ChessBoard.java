package ru.job4j.condition;

public class ChessBoard {
    private static boolean rangeNum(int coordinate) {
    return coordinate >= 0 && coordinate <= 7;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int rslX = Math.abs(x1 - x2);
        int rslY =  Math.abs(y1 - y2);
        if (rangeNum(x1) && rangeNum(y1) && rangeNum(x2) && rangeNum(y2)) {
            if (rslX == rslY) {
                rsl = rslX;
            }
        }
        return rsl;
    }
}
