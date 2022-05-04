package com.example.alex;

import javafx.scene.control.skin.TableHeaderRow;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateNumber  {
    public static void CalculateNumber(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double[] array = new double[count];
        double sum = 0;

        for (int i = 0; i < array.length; i++) {

            System.out.print("your number: " + (i + 1) );

            array[i] = scanner.nextDouble();
            scanner.close();
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        double median;
        Arrays.sort(array);
            int TotalNumbers = array.length;
        if  (TotalNumbers % 2 == 0) {
            double sumOfMiddleNumbers = array[TotalNumbers / 2] + array[TotalNumbers / 2 - 1];
         // average
        median = ((double)sumOfMiddleNumbers) / 2;}
            else {
                median = (double)
                array[array.length / 2];
            }
            double average = sum / count;
            double diff =average - median;
            System.out.format( "Result average is : ",average) ;
            System.out.format("Result difference is :", diff);





    }
}
