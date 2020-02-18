package com;

public class Problem5 {

    public static int smallestDivisibleBy (int nextDividers) {
        int x;
        boolean c=true;
        for (x=1; ; x++) {
            for (int i = 1; i <= nextDividers; i++) {
                c=true;
                if (x % i != 0) {
                    c=false;
                    break;
                }
            }
            if (c){
                break;
            }
        }
        return x;
    }   //this method takes number nextDividers and finds the smallest number divisible by every number from 1 to nextDivisible


    public static void main(String[] args) {
        System.out.println(smallestDivisibleBy(10));
        System.out.println(smallestDivisibleBy(20));    //this one prints the answer for Problem 5
    }
}
