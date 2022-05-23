package com.company;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        //reverse
        int count = mas.length / 2;
        for (int i = 0; i < count; i++) {
            int temp = mas[i];
            mas[i] = mas[mas.length - 1 - i];
            mas[mas.length - 1 - i] = temp;
        }

        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
