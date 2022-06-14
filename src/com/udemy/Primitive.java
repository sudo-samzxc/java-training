package com.udemy;

public class Primitive {
    public static void main(String[] args) {
        int value = 10000;
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;

        System.out.println("Integer minimum value = " + minInt);
        System.out.println("Integer minimum value = " + maxInt);
        System.out.println("Busted max value = " + (maxInt + 1));
        System.out.println("Busted max value = " + (minInt - 1));

        int maxIntLiteral = 2_147_483_647;

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        long longValue = 100L;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        long maxLong = 2_147_483_647_234L;
        short maxShortLiteral = 32767;
        byte maxByteLiteral = 127;

        int myTotal = (int) (maxLong - maxIntLiteral);
        System.out.println(myTotal);


        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;

        System.out.println(myMinFloat);
        System.out.println(myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;

        System.out.println(myMinDouble);
        System.out.println(myMaxDouble);

        int myInt = 5;
        float myFloat = 5 / 2;
        double myDouble = 5.00 / 2.00;

        float myFloatPoint = 5f / 2f;
        double myDoublePoint = 5d / 2d;

        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myFloatPoint);
        System.out.println(myDoublePoint);

        System.out.println("Pound to kilogram conversion");

        double pound = 5, kilogram;

        kilogram = pound * 0.45359237;

        System.out.println(kilogram);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_090d;
        System.out.println(pi);
        System.out.println(anotherNumber);





    }
}
