package com.alpha.practicalwork33.work2;

import java.util.*;

public class Runner {

    public void run() {
        Integer[] arrInt = createArrayInt();
        Arrays.sort(arrInt);
        System.out.println(Arrays.toString(arrInt));
        //Arrays.sort(arrInt, (a, b) -> b.compareTo(a));
        Arrays.sort(arrInt, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arrInt));

        List<String> strList = createStringList();
        System.out.println(strList);
        Collections.sort(strList);
        System.out.println(strList);
        strList.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println(strList);
    }

    private Integer[] createArrayInt() {
        Random random = new Random();
        Integer[] array = new Integer[20];
        for(int i = 0; i < 20; i++)
            array[i] = random.nextInt(100) - 50;
        return array;
    }

    private List<String> createStringList() {
        Random random = new Random();
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            strList.add(String.valueOf(Character.valueOf((char) (random.nextInt(26) + 65))));
        }
        return strList;
    }
}