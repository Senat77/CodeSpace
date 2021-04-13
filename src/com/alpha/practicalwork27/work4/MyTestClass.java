package com.alpha.practicalwork27.work4;

public class MyTestClass {

    private final int variable = 10;

    public void test() {
        System.out.println("MyTestClass : MyTestClass.value = " + variable);
        System.out.println("MyTestClass : MyStaticNested.value = " + new MyStaticNested().variable);
        System.out.println("MyTestClass : MyInner.value = " + new MyInner().variable);
        System.out.println("MyTestClass : MyLocal.value not available");

        new MyStaticNested().test();
        new MyInner()
    }

    static class MyStaticNested {
        private final int variable = 20;

        public void test() {
            System.out.println("\nMyStaticNested : MyTestClass.value not available");
            System.out.println("MyStaticNested : MyStaticNested.value = " + variable);
            System.out.println("MyStaticNested : MyInner.value  not available");
            System.out.println("MyStaticNested : MyLocal.value not available");
        }
    }

    class MyInner {
        private final int variable = 30;
    }

    private int methodWithLocalClass () {
        class MyLocal {
            public int getTest() {
                int variable = 40;
                return 100;
            }
        }
        return new MyLocal().getTest();
    }
}
