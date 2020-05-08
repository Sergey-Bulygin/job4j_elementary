package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Class   AttachmentSort
 * Created 07/05/2020 - 20:46
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> sizeComparator =  new Comparator<>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize() - right.getSize();
            }
        };
        Comparator<Attachment> nameComparator =  new Comparator<>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getName().compareTo(right.getName());
            }
        };
        attachments.sort(sizeComparator);
        System.out.println(attachments);
        attachments.sort(nameComparator);
        System.out.println(attachments);
    }
}
