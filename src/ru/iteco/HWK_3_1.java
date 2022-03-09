package ru.iteco;

public class HWK_3_1 {




    public void HW_3_1 () {

        //Определение массива
        System.out.println("Задение №1:");
        int[] array = {3,22,1,13,4,6,16,5};


        //Задание 3.1
        //Вывод из массива чётных чисел
        System.out.print("Чётные числа массива:      ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) System.out.print(array[i] + " ");
        }
        System.out.println("\n");


        //Задание 3.2
        // Вывод двузначных чисел
        //Массив из 1-го задания
        System.out.print("Двузначные числа массива:  ");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 9) && (array[i] < 100)) System.out.print(array[i] + " ");
        }
        System.out.println("\n");


        //Задание 3.3
        //Наибольшее число
        //Массив из 1-го задания
        int dd = array[0];
        System.out.print("Наибольшее значение:       ");
        for (int i = 1; i < array.length; i++ ) {
            if (array[i] > dd ) {
                dd = array[i];
                System.out.println(dd);
            }
        }
        System.out.println();


        //Задание 3.4
        //Сумма значений в массиве
        //Массив из 1-го задания
        int sum = array[0];
        System.out.print("Сумма значений массива:    ");
        for (int i = 1; i < array.length; i++ ) {
            sum += array[i];
        }
        System.out.println(sum + "\n");


        //Задание 3.5
        //Вывести значения из массива в обратном порядке
        //Массив из 1-го задания
        System.out.print("Массив в обратном порядке: ");
        for (int i = 7; i >= 0; --i) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\n\n");
    }

}
