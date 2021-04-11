package com.alpha.practicalwork27.work4;

public class MyTestClass {

    private final int test = 10;

    public void test() {
        System.out.println("MyTestClass : My test = " + test);
        System.out.println("MyTestClass : Static test = " + MyStaticNested.test);
        System.out.println("MyTestClass : Inner test = " + new MyInner().test);
        System.out.println("MyTestClass : Local test = " + methodWithLocalClass());
    }

    static class MyStaticNested {
        private static final int test = 20;
    }

    class MyInner {
        private int test = 30;
    }

    private int methodWithLocalClass () {
        class MyLocal {
            public int getTest() {
                int test = 40;
                return test;
            }
        }
        return new MyLocal().getTest();
    }
}
