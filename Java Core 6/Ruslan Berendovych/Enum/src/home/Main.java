package home;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        outputRegion();
        NumbersGetting numbersGetting = new NumbersGetting(scn.nextInt());
        System.out.println();
        System.out.println("Ваш номер:");
        numbersGetting.initializateNumber();
    }


//Вивід списку областей.
    public static void outputRegion(){
        System.out.println("==================");
        System.out.println("З якої ви області?");
        System.out.println("==================");
        System.out.println("1.Волинська.    || 2.Львівська.\n" +
                            "3.Закарпатська. || 4.Рівненська.\n" +
                            "5.Тернопільська.|| 6.Івано-Франківська.\n" +
                            "7.Київська.     || 8.Житомирська.\n" +
                            "9.Хмельницька.  || 10.Чернівецька.\n" +
                            "11.Чернігівська.|| 12.Черкаська\n" +
                            "13.Вінницька.   || 14.Сумська.\n" +
                            "15.Полтавська.  || 16.Кіровоградська.\n" +
                            "17.Миколаївська || 18.Одеська\n" +
                            "19.Харківська.  || 20.Дніпровська.\n" +
                            "21.Луганська.   || 22.Донецька.\n" +
                            "23.Запорізька.  || 24.АР Крим.\n" +
                            "25.Херсонська.  || ");
    }

}
