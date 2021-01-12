package com.ovic;

import java.util.Random;

public class NumberTheory {

    // method to generate random numbers with specified range
    private static int getRandomInRange(int start, int end) {
        final Random generator = new Random();
        return start + generator.nextInt(end - start + 1);
    }

    // method to generate int with required number of bits
    // if reqBit = 5 so the number will be int with 4bits and last bit reserved as sign bit
    public static int generateNumber(int reqBit) {
        return getRandomInRange((int) Math.pow(2, reqBit - 2) , (int) Math.pow(2, reqBit - 1) - 1);
    }

    public static void Naive1(int b, int n, int m){
        System.out.print("b = " + b);
        System.out.print(" ,n = " + n);
        System.out.println(" ,m = " + m);
        long startTime = System.nanoTime();
        int r= 1;
        for(int i = 0; i < n; i++){
            r = r * b;
        }
        r = r % m;
        long stopTime = System.nanoTime();;
        System.out.println(r);
        System.out.println("elapsed time = " +(stopTime - startTime));
    }

    public static void Naive2(int b, int n, int m){
        System.out.println("");
        System.out.print("b = " + b);
        System.out.print(" ,n = " + n);
        System.out.println(" ,m = " + m);
        long startTime = System.nanoTime();
        int r= 1;
        for(int i = 0; i < n; i++){
            r = (r * b) % m;
        }
        long stopTime = System.nanoTime();;
        System.out.println(r);
        System.out.println("elapsed time = " +(stopTime - startTime));
    }

    public static void ModularExponentiationIterative(int b, int n, int m){
        System.out.println("");
        System.out.print("b = " + b);
        System.out.print(" ,n = " + n);
        System.out.println(" ,m = " + m);
        long startTime = System.nanoTime();
        int r = 1;
        while (n>0){
            if((n & 1) == 1){ r = (r*b) % m;}
            n = n >> 1;
            b = (b*b) % m;
        }
        long stopTime = System.nanoTime();;
        System.out.println(r);
        System.out.println("elapsed time = " +(stopTime - startTime));
    }

    public static int ModularExponentiationRecursive(int b, int n, int m){
        int r=1;
        if(b == 0){return 0 ;}
        if(n == 0){return 1 ;}
        // if n is even
        if((n % 2) == 0){
            r = ModularExponentiationRecursive(b,n/2,m);
            r = (r*r) % m;
        }
        // if n is odd
        else {
          r = b % m ;
          r = (r * ModularExponentiationRecursive(b,n-1,m) % m) % m ;
        }
        return (r + m) % m;
    }

}
