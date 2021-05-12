package com.alpha.practicalwork34.work2;

import java.util.Arrays;

public class MySumCount_1 extends Thread {

    private int startIndex;
    private int stopIndex;
    private int[] myArray;
    private long resultSum;

    public MySumCount_1(int startIndex, int stopIndex, int[] myArray) {
        super();
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.myArray = myArray;
    }

    @Override
    public void run() {
        resultSum = Arrays.stream(myArray).limit(stopIndex + 1).skip(startIndex).sum();
    }

    public long getResultSum() {
        return resultSum;
    }
}
