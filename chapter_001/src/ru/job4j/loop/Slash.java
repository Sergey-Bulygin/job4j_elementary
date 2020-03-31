package ru.job4j.loop;

/**
 * Class Slash.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 31.03.2020.
 */
public class Slash {

    /**
     * Method print cross.
     * @param size size bord.
     * @return cross.
     */
    public static String draw(int size) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell;
                boolean right = row == size - cell - 1;
                if (left) {
                    screen.append("0");
                } else if (right) {
                    screen.append("0");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
