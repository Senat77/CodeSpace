package com.alpha.practicalwork36.work1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class Runner {

    @SuppressWarnings("deprecation")
    public void run() {
        System.out.println("MAX = " + findMax(10, 8, 3, 5, 9, 100, 2));
        System.out.println("MAX (empty array) = " + findMax());
    }

    /*
    @Deprecated
    private Integer findMax(int ... array) {
        OptionalInt res = Arrays.stream(array).max();
        return (res.isPresent()) ? res.getAsInt() : null;
    }
     */

    @SafeVarargs
    private <T extends Comparable<T>> T findMax(T ... array) {
        Optional res = Arrays.stream(array).max(Comparator.naturalOrder());
        return (res.isPresent()) ? (T) res.get() : null;
    }
}