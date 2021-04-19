package com.alpha.practicalwork31;

import com.alpha.practicalwork31.work2.Runner;

import java.io.IOException;

public class Task31 {

    public static void main(String[] args) throws IOException {
        Runner runner = new Runner();
        args = new String[2];
        args[1] = "c:\\temp\\1_Rename.bat";
        runner.run(args[1]);
    }
}
