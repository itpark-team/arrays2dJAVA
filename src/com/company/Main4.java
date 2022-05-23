package com.company;

import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 3, m = 4;

        int[][] mas = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------");

        for (int j = 0; j < m; j++){
            for (int i = 0; i < n; i++)  {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
