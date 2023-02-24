package ru.TaskTwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.Просим пользователя ввести дату последнего полива
        System.out.println("Введите дату последнего полива в формате [ДД.ММ.ГГГГ]: ");
        final Scanner sc = new Scanner(System.in);
        String dateWateringString = sc.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        Date date = new Date();

        try {
            date = formatter.parse(dateWateringString);
        } catch (ParseException e) {
            System.out.println("Ошибка. Введена дата не по формату [ДД.ММ.ГГГГ]");
        }

        //2. Определяем какое это время года
        int month = date.getMonth();
        final String seasons[] = {"Winter", "Winter", "Spring", "Spring", "Spring", "Summer", "Summer",
                "Summer", "Fall", "Fall", "Fall", "Winter"};
        //System.out.println(seasons [(month)]);

        //3. Определяем дату следующего полива
        //HumiditySensor num1 = new HumiditySensor();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);

        if (seasons[(month)].equals("Winter")) {
            instance.add(Calendar.MONTH, 1);
            Date newDate = instance.getTime();
            System.out.println(formatter.format(newDate));
        } else {
            if (seasons[(month)].equals("Spring") || seasons[(month)].equals("Fall")) {
                instance.add(Calendar.WEEK_OF_MONTH, 1);
                Date newDate1 = instance.getTime();
                System.out.println(formatter.format(newDate1));
            } else {
                if (seasons[(month)].equals("Summer") && HumiditySensor.getHumidity()>30) {
                    instance.add(Calendar.DAY_OF_MONTH, 2);
                    Date newDate2 = instance.getTime();
                    System.out.println(formatter.format(newDate2));
                } else {
                    System.out.println("Кактус нужно полить сегодня");
                }
            }


        }

    }
}
