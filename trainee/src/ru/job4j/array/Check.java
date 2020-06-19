package ru.job4j.array;

/**
 * Class   Check
 * Created 02/04/2020 - 16:42
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class Check {

    /**
     * The method checks the array for
     * filling only true or false.
     * @param data boolean array.
     * @return boolean result.
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
          for (int index = 0; index < data.length - 1; index++) {
              if (data[index] != data[index + 1]) {
                  result = false;
                  break;
              }
          }
        return result;
    }
}
