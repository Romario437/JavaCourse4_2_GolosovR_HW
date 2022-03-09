package ru.iteco;

import java.util.Scanner;

public class HWK_4_3_5 {


    public void runHW_4_3_5() {
        //Задание 4_3_5
        System.out.print("Введите имя и число через пробел.\nСумма цифр в числе не должна превышать 10!\n>");
        String[] chisla = {"Ноль", "Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять", "Десять"};
        Scanner scr = new Scanner(System.in);
        String[] pay_name = (scr.nextLine()).split(" ");
        int number = Integer.parseInt(pay_name[1]);

        System.out.println ("Здравствуй " + pay_name[0] + "! Сумма цифр в числе " +
                pay_name[1] + " = " + chisla[sum_num(number)] + ".");
        scr.close();
    }


    public int sum_num(int number) {
       int summa = 0;
       if (number == 0) {
           return summa;
       }

        summa = (number % 10) + sum_num( number / 10);
        return summa;

    }
}







