package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // scanning variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of array rows : ");
        int rows = sc.nextInt();
        System.out.println("Please enter number of array columns : ");
        int cols = sc.nextInt();

        // defining two dimensional array of chars with rows x cols dimension
        char[][] myArray = new char[rows][cols];

        // filling array
        fillArray(rows, cols, myArray);

        // printing array
        printArray(rows, cols, myArray);
    }


    public static void fillArray(int totalRow, int totalColumn, char[][] array) {

        for (int i = 0; i < totalRow; i++) {
            for (int j = 0; j < totalColumn; j++) {
                if (i == 0 || i == totalRow - 1 || j == 0 || j == totalColumn - 1) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = '-';
                }
            }
        }
    }

    public static void printArray(int totalRow, int totalColumn, char[][] array) {
        System.out.println("Printing 2D array in matrix form : ");
        for (int i = 0; i < totalRow; i++) {
            for (int j = 0; j < totalColumn; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
