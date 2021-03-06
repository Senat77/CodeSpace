package com.alpha.practicalwork22.work3;

import java.util.Random;

public class ID {

    private static int nextId;

    static {
        nextId = new Random().nextInt(100);
    }

    private int id;

    public ID() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID{" +
                "id=" + id +
                " nextId = " + nextId +
                '}';
    }
}
