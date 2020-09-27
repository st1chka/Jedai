package geekbrains.lesson_1;

import java.util.Scanner;

public class Main {

//Домашка 27.09.2020
    // Задание №1-------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
//       Задание №2-----------------------------------------------------------------------------------------------------

        boolean a = false;
        byte b = 127;
        char c = 'v';
        short d = 123;
        int i = 228;
        long f = 123456L;
        float g = 12.8f;
        double h = 3.14;

        System.out.println("Задание 2");
        System.out.println("Значение boolean = " + a);
        System.out.println("Значение byte = " + b);
        System.out.println("Значение char = " + c);
        System.out.println("Значение short = " + d);
        System.out.println("Значение int = " + i);
        System.out.println("Значение long = " + f);
        System.out.println("Значение float = " + g);
        System.out.println("Значение double = " + h);
//       Задание №3-----------------------------------------------------------------------------------------------------
        System.out.println("Задание №3");
        System.out.println("Решим задачу  a * (b + (c / d)), введи их значения");
        Scanner str = new Scanner(System.in);
        int ar = str.nextInt();
        int br = str.nextInt();
        int cr = str.nextInt();
        int dr = str.nextInt();

       int vr =  reshZadania3( ar, br, cr, dr);
        System.out.println(vr);
//       Задание №3-----------------------------------------------------------------------------------------------------


//       Задание №4-----------------------------------------------------------------------------------------------------
        boolean io = reshZadania4();
//       Задание №4-----------------------------------------------------------------------------------------------------


//       Задание №5-----------------------------------------------------------------------------------------------------


        reshZadania5();


//       Задание №5-----------------------------------------------------------------------------------------------------

//       Задание №6-----------------------------------------------------------------------------------------------------
        System.out.println("Задание 6");
        Scanner in = new Scanner(System.in);
        System.out.println("Введи число ОТРИЦАТЕЛЬНОЕ пожалуйста");
        int ff = in.nextInt();

//        System.out.println("  ");

        boolean bo = reshZadania6(ff);
        if (bo == true){
            System.out.println("Спасибочки!");
        } else {
            System.out.println("Ты меня обманул :с");
        }
//       Задание №6-----------------------------------------------------------------------------------------------------


//       Задание №7-----------------------------------------------------------------------------------------------------
       Scanner sc = reshZadania7();
        System.out.println("Привет " + sc.nextLine()+"!!!");
//       Задание №7-----------------------------------------------------------------------------------------------------


//       Задание №8-----------------------------------------------------------------------------------------------------
        System.out.println("Задача 8");
        System.out.println("Введи год, я скажу, високосный он или нет :)");
        Scanner scan = new Scanner(System.in);
        int yer = scan.nextInt();
        reshZadania8(yer);
//       Задание №8-----------------------------------------------------------------------------------------------------
        System.out.println("Надеюсь всё ок");
    }
    // Задание №3-------------------------------------------------------------------------------------------------------
    public static int reshZadania3(int a, int b, int c, int d ) {

        int v = a * (b + (c / d));
        System.out.print("Ответ на третье задание " + a +" * ("+b+" + ("+ c+ " / "+d+ ")) = ");
        return v;

    }
    // Задание №4-------------------------------------------------------------------------------------------------------
    public static boolean  reshZadania4(){
        System.out.println("Задание №4");
        boolean io = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Сложим 2 числа, ответ должен быть от 10 до 20");
        int b = in.nextInt();
        int a = in.nextInt();
        int c = a+b;

           if (c >= 10 && c <= 20) {
               io = true;
               System.out.println("Всё верно!!!" +" Получилось " +c);
           } else {
               io = false;
               System.out.println("Не верно!!" + " Получилось " +c);
           }  return io;
    }
    // Задание №5-------------------------------------------------------------------------------------------------------
    public static void reshZadania5 () {
        System.out.println("Задание №5");
        System.out.println("Введи положительное или отрицательно число, а я попробую угадать!");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>=0){
            System.out.println("Это положительное число!");
        } else if (a<=0){
            System.out.println("Это отрицательное  число!");
        }
    }
    // Задание №6-------------------------------------------------------------------------------------------------------
    public static boolean reshZadania6(int a) {
        boolean bo;
        if (a < 0 && a !=0){
             bo = true;
        } else {
             bo = false;
        }
        return bo;
    }
    // Задание №7-------------------------------------------------------------------------------------------------------
    public static Scanner reshZadania7(){
        System.out.println("Задание 7");
        System.out.println("Как тебя зовут?");
        Scanner sc = new Scanner(System.in);

        return sc;
    }
    // Задание №8-------------------------------------------------------------------------------------------------------
    private static void reshZadania8(int yer){

        if (yer % 4 ==0 || yer % 100 ==0 || yer % 400 ==0){
            System.out.println("Високосный");
        } else{
            System.out.println("Не високосный");
        }

    }

}