package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Class   Decrease
 * Created 18/08/2020 - 10:46
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class Decrease {
    public static void main(String[] args) {
        String[] names = {
                "sun",
                "summer",
                "beach"
        };
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + right.length() + " : " + left.length());
            return right.length() - left.length();
        };
        Arrays.sort(names, cmpDescSize);
    }
}

