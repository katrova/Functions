/*
 * Classname Main
 *
 * Version info 1
 *
 * Copyright Vasylkivska Kateryna KNTEU
 *  */

//------------------------------------------
//3.  Get the area limited by the following functions   x = 0 .. 3.14;
// y = sin(x);   y = 0.1 * k, where k is the last cipher in your student card;
package com.company;

public class Main {

    public static void main(String[] args) {
        
        double finish = Math.PI;
        double deltaX = 0.03;
        double y = 0.0;   // April 10th birthday
        double rectangle;
        double area = 0;

        for (double x = 0; x < finish; x += deltaX) {

            if (Math.sin(x) <= y) {
                rectangle = Math.sin(x) * deltaX;
            } else {
                rectangle = y * deltaX;
            }
            area += rectangle;
        }
        System.out.println(area);
    }
}

