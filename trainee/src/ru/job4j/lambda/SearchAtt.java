package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Class   SearchAtt
 * Created 19/06/2020 - 8:24
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class SearchAtt {
    public static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment item : list) {
            if (predicate.test(item)) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Attachment> list = new ArrayList<>();
        list.add(new Attachment("debug", 90));
        list.add(new Attachment("bug", 120));
        list.add(new Attachment("virus", 100));

        System.out.println(filter(list, x -> x.getSize() > 100 && x.getName().equals("bug")));
    }
}

