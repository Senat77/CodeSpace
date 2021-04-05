package com.alpha.PracticalWork25.work4;

public class Runner {

    @SuppressWarnings("deprecated")
    public void run() {
        int i = 127;
        Integer i1 = Integer.valueOf(i);
        Integer i2 = new Integer(i);
        Integer i3 = i;
        Integer i4 = i3;

        System.out.println("i1 == i2 : " + (i1 == i2));
        System.out.println("i1 equals i2 : " + (i1.equals(i2)));
        System.out.println("i1 == i3 : " + (i1 == i3));
        System.out.println("i1 equals i3 : " + (i1.equals(i3)));
        System.out.println("i1 == i4 : " + (i1 == i4));
        System.out.println("i1 equals i4 : " + (i1.equals(i4)));

        System.out.println("\nSum = " + sum(1, 3.3f));
        System.out.println("Sum = " + sum(Integer.valueOf("1"), Float.valueOf("3.3")));
    }

    private Double sum (Integer i, Float f) {
        return Double.valueOf(i + f);
    }
}
