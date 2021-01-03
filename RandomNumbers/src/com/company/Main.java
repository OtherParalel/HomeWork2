package com.company;

import java.lang.Math;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("случайное число:" + Math.random());
        Random random = new Random();

        int a = 0; // Начальное значение - "от"
        int b = 10; // Конечное значение - "до"
        int random_number66 = a + (int) (Math.random() * b); // Генерация
        System.out.println("случайное число от 0 до 10:" + random_number66);


        int y = 0;
        int zet = 0;
        while (zet < 10) {
            y = random.nextInt((10));
            System.out.println("Десять случайных чисел: " + y);
            zet++;
        }

        int n3 = 0;
        int ah7 = 0;
        while (ah7 < 10) {
            n3 = random.nextInt((50 - 20)) + 20;
            System.out.println("Случайное число от 20 до 50: " + n3);
            ah7++;
        }




        for (int i = 0; i < 10; i++) {
            System.out.println("Случайное число от -10 до 10: " + (getRandomNumberInRange(-10, 10)));
        }

    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}

//        int net = 20;
//        int da = 0;
//        while (da < 10) {
//            Random r = new Random();
//            net = r.nextInt((20 50));
//            System.out.println("случайные числа от 20 до 50:" + (net));
//            da++;
//        }


//        for (int i = 0; i < 10; i++) {
//            System.out.println(getRandomNumberInRange(20, 50));
//        }
//
//    }
//
//    private static int getRandomNumberInRange(int min, int max) {
//
//        if (min >= max) {
//            throw new IllegalArgumentException("max must be greater than min");
//        }
//
//        Random r = new Random();
//        return r.nextInt((max - min) + 1) + min;


//        int i = 0;
//            int min = 20;
//            int max = 50;
//        while (i < 10; i++) {
//            (min <= max) {
//                Random r = new Random();
//                return r.nextInt((max - min) + 1 + min;
//            }
//
//            System.out.println();
//        }
//
//    }
//
//    }


//    public long nextLong(long bound) {
//        if (bound <= 0)
//            throw new IllegalArgumentException(BAD_BOUND);
//        long r = mix64(nextSeed());
//        long m = bound - 1;
//        if ((bound & m) == 0L) // power of two
//            r &= m;
//        else { // reject over-represented candidates
//            for (long u = r >>> 1;
//                 u + m - (r = u % bound) < 0L;
//                 u = mix64(nextSeed()) >>> 1)
//                ;
//        }
//        return r;


//            int getRandomNumberInRange(int min, int max) {
//            while (min > max) {
//                throw new IllegalArgumentException("max must be greater than min");
//            }
//                Random ra = new Random();
//                int i = ra.nextInt((max - min) + 1) + min);
//                System.out.println((zi) = +min);
//            }



       /*public static int generrateRandomInt(int min = 0, int max = 10){
            Random random = new Random();
            return random.inst(min,(max+1)).findFirst().getAsInst;*/




      /*  int masha = 0; // Начальное значение - "от"
        int dasha = 10; // Конечное значение  - "до"
        int random_number1 = masha + (int) (Math.random() * dasha);
        System.out.println("1-ое случайное число: " + random_number1);
        int random_number2 = masha + (int) (Math.random() * dasha);
        System.out.println("2-ое случайное число: " + random_number2);
        int random_number3 = masha + (int) (Math.random() * dasha);
        System.out.println("3-ое случайное число: " + random_number3);
        int random_number4 = masha + (int) (Math.random() * dasha);
        System.out.println("4-ое случайное число: " + random_number4);
        int random_number5 = masha + (int) (Math.random() * dasha);
        System.out.println("5-ое случайное число: " + random_number5);
        int random_number6 = masha + (int) (Math.random() * dasha);
        System.out.println("6-ое случайное число: " + random_number6);
        int random_number7 = masha + (int) (Math.random() * dasha);
        System.out.println("7-ое случайное число: " + random_number7);
        int random_number8 = masha + (int) (Math.random() * dasha);
        System.out.println("8-ое случайное число: " + random_number8);
        int random_number9 = masha + (int) (Math.random() * dasha);
        System.out.println("9-ое случайное число: " + random_number9);
        int random_number10 = masha + (int) (Math.random() * dasha);
        System.out.println("10-ое случайное число: " + random_number10);






        int da = 20; // Начальное значение - "от"
        int net = 50; // Конечное значение  - "до"
        while(random_number <= 10){
            []
        }
        int random_number11 = da + (int) (Math.random() * net);
        System.out.println("1-ое случайное число: " + random_number11);
        int random_number12 = da + (int) (Math.random() * net);
        System.out.println("2-ое случайное число: " + random_number12);
        int random_number13 = da + (int) (Math.random() * net);
        System.out.println("3-ое случайное число: " + random_number13);
        int random_number14 = da + (int) (Math.random() * net);
        System.out.println("4-ое случайное число: " + random_number14);
        int random_number15 = da + (int) (Math.random() * net);
        System.out.println("5-ое случайное число: " + random_number15);
        int random_number16 = da + (int) (Math.random() * net);
        System.out.println("6-ое случайное число: " + random_number16);
        int random_number17 = da + (int) (Math.random() * net);
        System.out.println("7-ое случайное число: " + random_number17);
        int random_number18 = da + (int) (Math.random() * net);
        System.out.println("8-ое случайное число: " + random_number18);
        int random_number19 = da + (int) (Math.random() * net);
        System.out.println("9-ое случайное число: " + random_number19);
        int random_number20 = da + (int) (Math.random() * net);
        System.out.println("10-ое случайное число: " + random_number20);*/


//      else (y < 0);
//        return "I четверть";
//        } if (y < 0) {
//        return  "IV четверть";
//        } if (x < 0) {
//        if (y > 0) {
//        return   "II  четверть";
//        } if (y < 0) {
//        return  "III четверть";
//        }
//        }  if (x == 0) {
//        if (y > 0) {
//        return "I, II четверть";
//        }    if (x < 0) {
//        return  "II, III четверть";
//        }  if (y < 0) {
//        return  " III, IV четверть";
//        }if (y == 0) {
//        if (x > 0) {
//        return "IV I четверть";
//        if (x == 0) {
//        if (y == 0) {
//        return "0";
