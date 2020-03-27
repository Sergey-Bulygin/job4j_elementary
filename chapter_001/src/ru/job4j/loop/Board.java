package ru.job4j.loop;

/**
 * Class Board.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 27.03.2020.
 */
public class Board {
    /**
     * Method print chess board.
     * @param weight width board.
     * @param height height board.
     * @return board.
     */
    public String paint(int weight, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if ((row + column) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
