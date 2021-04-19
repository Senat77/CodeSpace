package com.alpha.practicalwork29.work1;

import java.util.*;

public class Runner {

    public void run() {

        List<String> listArray = new ArrayList<>();
        List<String> listLink = new LinkedList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {
            listArray.add("number_" + i);
            listLink.add(rand.nextInt(i + 1), "num_" + i);
        }
        System.out.println(listArray);
        System.out.println(listLink);

        ListIterator<String> listArrayIterator = listArray.listIterator(listArray.size());
        ListIterator<String> listLinkIterator = listLink.listIterator();
        do {
            listLinkIterator.next();
            listLinkIterator.add(listArrayIterator.previous());
        }
        while (listArrayIterator.hasPrevious());
        System.out.println(listLink);
    }
}
