package com.mostdevwill.javaexample;

public class Main {

    public static void main(String[] args) {
        System.out.println("I'm running");
        Example example = new Example();
        runMethod1(example);
    }

    static void runMethod1(Example example) {
        example.method1();
    }
}
