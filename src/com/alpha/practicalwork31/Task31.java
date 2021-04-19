package com.alpha.practicalwork31;

import com.alpha.practicalwork31.work1.Runner;

import java.io.IOException;

public class Task31 {

    public static void main(String[] args) throws IOException {
        Runner runner = new Runner();
        args = new String[2];
        args[1] = ".";
        runner.run();
    }
}
