package com.programs;

public class Factorial {
    public static void main(String[] args) {
        int num = 5, fact =1;
        for(int i=2;i<= num;i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
