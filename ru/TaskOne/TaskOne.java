package ru.TaskOne;

import java.util.Scanner;

public class TaskOne {
    //Мальчик хочет написать на заборе признание в любви девочке из пятнадцати букв и трех пробелов.
    // На каждые три буквы мальчик тратит по 62 см длины забора, а на каждый пробел - 12 см.
    // Напишите программу, которая поможет по длине забора (введенной пользователем) выяснить,
    // поместится ли на забор такой длины надпись мальчика
    public static void main(String[] args) {
        int strLength = 15/3*62+3*12;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину забора в сантиметрах: ");
        int res = sc.nextInt();
        if (res <= strLength) {
            System.out.println("Места для надписи хватит");
        } else {
            System.out.println("Надпись на заборе не поместится");
        }

    }

}
