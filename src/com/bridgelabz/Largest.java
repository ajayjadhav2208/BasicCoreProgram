package com.bridgelabz;

public class Largest {
    public static void main(String[] args) {

        double n1 = -9.9, n2 = 9.9, n3 = 8.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}
