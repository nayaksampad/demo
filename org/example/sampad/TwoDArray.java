package org.example.sampad;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int arr[][] = new int[4][3];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println("Array:" + i + j);
                arr[i][j] = s.nextInt();

            }
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(arr[i][j]);

            }

        }
    }
}
