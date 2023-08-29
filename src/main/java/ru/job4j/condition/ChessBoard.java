package ru.job4j.condition;

public class ChessBoard {
    private static boolean rangeNum(int coordinate) {
    return coordinate >= 0 && coordinate <= 7;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (rangeNum(x1) && rangeNum(y1) && rangeNum(x2) && rangeNum(y2)) {
            if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                rsl = Math.abs(x1 - x2);
            }
        }
        return rsl;
    }
}
