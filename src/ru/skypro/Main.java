package ru.skypro;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] arrayExpenses = generateRandomArray();
        double expensesSumPerMonth = 0; // прописал переменную как double,
        // чтобы выбивался остаток при нахождении
        // ср. арифметического в 3 задаче

        System.out.println();
        System.out.println("Задача 1 - Найти общую сумму за месяц");
        System.out.println();

        for (int i = 0; i < arrayExpenses.length; i++) {
            expensesSumPerMonth = expensesSumPerMonth + arrayExpenses[i];
            System.out.println();
        }
        System.out.println("Сумма трат за месяц составила: " + expensesSumPerMonth + " рублей");

        System.out.println();
        System.out.println("Задача 2 - Найти минимальное и максимальное значения");
        System.out.println();

        int minExpensesPerDay = arrayExpenses[0];
        int maxExpensesPerDay = arrayExpenses[0];

        for (int i = 0; i < arrayExpenses.length - 1; i++) {
            if (arrayExpenses[i] < minExpensesPerDay) {
                minExpensesPerDay = arrayExpenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + minExpensesPerDay + " рублей");

        for (int i = 0; i < arrayExpenses.length - 1; i++) {
            if (arrayExpenses[i] > maxExpensesPerDay) {
                maxExpensesPerDay = arrayExpenses[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила: " + maxExpensesPerDay + " рублей");


        System.out.println();
        System.out.println("Задача 3 - Найти среднее значение");
        System.out.println();

        double averageValue = 0;

        for (int i = 0; i < arrayExpenses.length; i++) {
            averageValue = (expensesSumPerMonth / arrayExpenses.length);

        }
        System.out.println("Средняя сумма трат за месяц составила: " + averageValue + " рублей"); //

        System.out.println();
        System.out.println("Задача 4 - Вернуть как было");
        System.out.println();

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

        System.out.println();
        System.out.println("ЗАДАЧИ ПОВЫШЕННОЙ СЛОЖНОСТИ");
        System.out.println("ЗАДАЧА №5");


        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0, x = matrix[i].length - 1; j < matrix[i].length; j++, x--) {
                if (i == j || i == x) matrix[i][j] = 1;
                else matrix[i][j] = 0;
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("ЗАДАЧА №6");

        int[] revArr = {5, 4, 3, 2, 1};
        int[] revArr2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < revArr.length; i++) {
        }
        System.out.println(Arrays.toString(revArr));


        for (int i = 0; i < revArr.length; i++) {
            revArr = revArr2;
        }
        System.out.println(Arrays.toString(revArr));


        System.out.println();
        System.out.println("ЗАДАЧА №7");
        for (int i = 0; i < revArr.length; i++) {
            int j = revArr[i];
            revArr[i] = revArr[revArr.length - i - 1];
            revArr[revArr.length - i - 1] = j;
        }
        System.out.println(Arrays.toString(revArr));

//        for (int i = 0; i<revArr.length; i++) {
//        Collections.reverse(Arrays.asList(revArr));
//            System.out.print(revArr[i]+", ");
//        }

        System.out.println();
        System.out.println("ЗАДАЧА №8");
        int[] hardArr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < hardArr.length / 4; i++) {
            for (int j = 0; j < hardArr.length; j++) {
                Arrays.sort(hardArr);
                int x = hardArr[i];
                int y = hardArr[j];
                if (hardArr[i] + hardArr[j] == -2) {
                    System.out.print(hardArr[j] + " " + hardArr[i] + " ");
                }
            }
        }

        System.out.println();
        System.out.println("ЗАДАЧА №9");

        int[] hardArr2 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < hardArr2.length / 2; i++) {
            for (int j = 0; j < hardArr2.length; j++) {
                Arrays.sort(hardArr2);
                int x = hardArr2[i];
                int y = hardArr2[j];
                if (hardArr2[i] + hardArr2[j] == -2) {
                    System.out.print(hardArr2[j] + " " + hardArr2[i] + " ");
                    System.out.println();
                }
            }
        }
    }


    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
}

