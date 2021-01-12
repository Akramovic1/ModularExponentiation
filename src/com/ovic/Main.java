package com.ovic;

public class Main {

    public static void main(String[] args) {

        // enter the number of bits for integers
        int bits = 17;
        int b = NumberTheory.generateNumber(bits);
        int n = NumberTheory.generateNumber(bits);
        int m = NumberTheory.generateNumber(bits);

        /////////////////////////////////////////////////////////////////////////////////////

        // for Naive-1
        System.out.println("Naive-1 with number of bits = " + bits);
        NumberTheory.Naive1(b,n,m);

        /////////////////////////////////////////////////////////////////////////////////////

        // for Naive-2
        System.out.println("Naive-2 with number of bits = " + bits);
        NumberTheory.Naive2(b,n,m);

        /////////////////////////////////////////////////////////////////////////////////////

        // for ModularExponentiationIterative
        System.out.println("ModularExponentiationIterative with number of bits = " + bits);
        NumberTheory.ModularExponentiationIterative(b,n,m);

        /////////////////////////////////////////////////////////////////////////////////////

        // for ModularExponentiationRecursive
        System.out.println("ModularExponentiationRecursive with number of bits = " + bits);
        System.out.print("b = " + b);
        System.out.print(",n = " + n);
        System.out.println(",m = " + m);
        long startTime = System.nanoTime();
        System.out.println(NumberTheory.ModularExponentiationRecursive(b,n,m));
        long stopTime = System.nanoTime();
        System.out.println("elapsed time = " +(stopTime - startTime));



    }

}
