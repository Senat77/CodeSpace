package com.alpha.practicalwork26.work3;

import java.util.Comparator;

public class MyComparatorColor implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
