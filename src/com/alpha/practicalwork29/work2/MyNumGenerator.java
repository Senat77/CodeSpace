package com.alpha.practicalwork29.work2;

import java.util.*;

public class MyNumGenerator {

    private final int numOfElm;
    private final int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List generateList() {
        List list = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < numOfElm; i++)
            list.add(rand.nextInt(maxNumb));
        return list;
    }

    public Set generateSet() {
        Set set = new HashSet<>();
        Random rand = new Random();
        for(int i = 0; i < numOfElm; i++)
            set.add(rand.nextInt(maxNumb));
        return set;
    }
}
