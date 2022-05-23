package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int countEmployers = 4;
        int countMonth = 6;

        int[][] salarySheet = new int[countEmployers][countMonth];

        for (int i = 0; i < countEmployers; i++) {
            for (int j = 0; j < countMonth; j++) {
                salarySheet[i][j] = random.nextInt(70 - 30 + 1) + 30;
            }
        }

        for (int i = 0; i < salarySheet.length; i++) {
            for (int j = 0; j < salarySheet[i].length; j++) {
                System.out.print(salarySheet[i][j] + " ");
            }
            System.out.println();
        }

    }
}
