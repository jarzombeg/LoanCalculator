package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        //your code goes here
        for (int x = 0; x != 6; x++) {
            double calc = amount ;
            calc = calc - (calc *0.1);
            amount = (int)calc;
        }
        System.out.println(amount);
    }
}

