package ru.iteco;

import java.util.Arrays;
import java.util.Scanner;

public class HWK_3_2_2 {


    public void runHW_3_2_2() {


        //Задаём массив array_1 ручками

        Scanner scr = new Scanner(System.in);

        System.out.println("Задаём массив array_1. \n");
        System.out.println("Введите 12 целых чисел, после каждого нажимая ввод!");
        System.out.println("(Не вводите !!!НИЧЕГО КРОМЕ ЧИСЕЛ!!! очень прошу\nили я сломаюсь.");
        System.out.print("> ");

        int[][] array_1 = new int[4][3];
        int i;
        int j;


        for (i = 0; i < array_1.length; i++) {
            for (j = 0; j < array_1[i].length; j++) {
                int cnt_1 = scr.nextInt();
                    array_1[i][j] = cnt_1;
                    System.out.println("Значение   array_1[" + i + "][" + j + "]=" + array_1[i][j] + ";");
                    System.out.print("> ");
            }
        }
            System.out.println("Не смотри на меня так, я стесняюсь!");
            System.out.println("Введите q для выхода или что-то другое для продолжения!");
            System.out.print("> ");

            //Хочу выйти если ввели q
            String str = scr.next();
            if (str.equals("q")) {
                System.out.println("Выход");
                return;
            }
            scr.close();


            //Вывод номеров строк и суммы их элементов

            System.out.println("\n\nЗадание №2:\n");
            System.out.println("Номера строк и сумма их элементов:");

            int lne = 0;

            for (i = 0; i < array_1.length; i++) {
                for (j = 0; j < array_1[i].length; j++) {
                    lne += array_1[i][j];
                } System.out.println("Сумма строки " + (i + 1) + " равна: " + lne);
                lne = 0;
            }



            //Вывод номеров колонок и суммы их элементов
            //Массив из 1-го задания

            System.out.println("\n\nНомера колонок и сумма их элементов:");

            int column = 0;


            for (j = 0; j < array_1[0].length; j++) {
                for (i = 0; i < array_1.length; i++) {
                    column += array_1[i][j];
                }
                System.out.println("Сумма колонки " + (j + 1) + " равна: " + column);
                column = 0;
            }



            //Заменить нечётные элементы массива на 1, а чётные на 0 и вывести в консоль
            //Массив из 1-го задания

            System.out.println("\n\nЗаменить нечётные элементы массива на 1,");
            System.out.print("чётные на 0 и вывести в консоль:");

            int[][] array_2= new int[4][3];

            for (i = 0; i < array_1.length; i++) {
                System.out.println();
                for (j = 0; j < array_1[i].length; j++) {
                    array_2[i][j] = array_1[i][j];
                    if (array_2[i][j] % 2 == 0) {
                        array_2[i][j] = 0;
                        System.out.print(array_2[i][j] + " ");
                    } else System.out.print((array_2[i][j] = 1) + " ");
                }
            }
            System.out.println("\n");



            //Среднее арифметическое строк
            //Массив из 1-го задания

            System.out.println("Целое среднее арифметическое строк массива:");

            int count = 0;
            for (int[] arr_v : array_1) {     //Создание контейнера arr_v без индексов
                count++;
                int arg = /*(int)*/ (Arrays.stream(arr_v).sum() / array_1[0].length);
                System.out.println("Среднее арифметическое строки" + count + ":  " + arg);
            }
            System.out.println("\n");



            //Двумерный массив сделать линейным и вывести в консоль в обратном порядке
            //Массив из 1-го задания

            System.out.println("Двумерный массив сделать линейным и");
            System.out.println("вывести в консоль в обратном порядке:");

            int[] array_4 = new int[12];
            int counter = 12;

            for (i = 0; i < array_1.length; i++) {
                for (j = 0; j < array_1[i].length; j++) {
                    counter--;
                    array_4[counter] = array_1[i][j];
                }
            }
            for (int temp : array_4) {
                System.out.print(temp + " ");
            }
            System.out.println("\n\nСпасибо за внимание!\n\n");
    }
}
