package ru.skypro;

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

        int minExpensesPerDay = arrayExpenses [0];
        int maxExpensesPerDay = arrayExpenses [0];

        for (int i = 0; i < arrayExpenses.length-1; i++) {
            if (arrayExpenses[i]<minExpensesPerDay) {
                minExpensesPerDay = arrayExpenses [i];
            }
        }System.out.println( "Минимальная сумма трат за день составила: " + minExpensesPerDay +  " рублей");

        for (int i = 0; i < arrayExpenses.length-1; i++) {
            if (arrayExpenses[i]>maxExpensesPerDay) {
                maxExpensesPerDay = arrayExpenses [i];
            }
        }System.out.println( "Максимальная сумма трат за день составила: " + maxExpensesPerDay +  " рублей");


        System.out.println();
        System.out.println("Задача 3 - Найти среднее значение");
        System.out.println();

        double averageValue = 0;

        for (int i = 0; i < arrayExpenses.length; i++) {
            averageValue = (expensesSumPerMonth /arrayExpenses.length);

        }   System.out.println("Средняя сумма трат за месяц составила: " + averageValue + " рублей"); //

        System.out.println();
        System.out.println("Задача 4 - Вернуть как было");
        System.out.println();

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print (reverseFullName[i]);
        }

    }


    int [] arr =generateRandomArray ();
    public static int [] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int [] arr=new int [30];
        for (int i = 0; i < arr.length; i++) {
            arr [i]=random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}

