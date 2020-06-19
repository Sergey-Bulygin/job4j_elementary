package ru.job4j.lambda;

/**
 * Class   Attachment
 * Created 07/05/2020 - 20:37
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class Attachment {
    private final String name;
    private final int size;

    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("{name='%s', size=%d}", name, size);
    }
}
