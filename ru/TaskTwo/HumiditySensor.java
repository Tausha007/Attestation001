package ru.TaskTwo;

import java.util.Random;

//класс который реализует датчик влажности
public class HumiditySensor {
    private static int min = 20;
    private static int max = 50;
    int humidity;


    public static int getHumidity() {
        Random random = new Random();
        int humidity = random.nextInt(min,max);
        return humidity;
    }

}
