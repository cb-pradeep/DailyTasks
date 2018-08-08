/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chargebee.beginnerprograms;

import java.util.Scanner;

/**
 *
 * @author cb-pradeepkumar
 */
public class FindXPowY {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x value");
        int x = sc.nextInt();
        System.out.println("Enter y value");
        int y = sc.nextInt();
        
        int result = findSmallestPowOfXGreaterThanY(x,y);
        System.out.println("Result is " + result);
    }

    private static int findSmallestPowOfXGreaterThanY(int x, int y) {
        int counter = 0;
        int result = 1;
        while(result <=y) {
            result = result * x;
            counter++;
        }
        return counter;
    }
}