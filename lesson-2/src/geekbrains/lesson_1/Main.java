package geekbrains.lesson_1;

import sun.security.x509.OtherName;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Задание 1");
        int[] number = new int[5];
        number[0] = 1;
        number[1] = 0;
        number[2] = 1;
        number[3] = 0;
        number[4] = 1;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == 0) {
                number[i] = 1;
            } else number[i] = 0;
            System.out.println(number[i]);
        }


        System.out.println("Задание 2 ");
        multiplicationThree();
        System.out.println("Задание 3 ");
        lessSix();
        System.out.println("Задание 4 ");
        squareArray();
        System.out.println("Задание 5 ");
        scanMinMax();
        System.out.println("Задание 6 ");
        plusArray();
        //пытался 7 сделать, но чет сложно.............
    }


    private static void multiplicationThree() {
        int[] number = new int[8];

        for (int i = 0; i < number.length; i++) {
            number[i] = i * 3;
            System.out.println("number[" + i + "]" + number[i]);
        }
    }

    private static void lessSix() {
        int[] number = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //2 10 6 4 11 8 10 4 8 8 9 2
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 6) {
                number[i] = number[i] * 2;
            } else if (number[i] > 6) {
                number[i] = number[i];
            }
            System.out.println(number[i]);
        }

    }

    private static void squareArray() {

        int con = 10;
        int[][] table = new int[con][con];
        for (int i = 0; i < con; i++) {
            for (int j = 0; j < con; j++) {
                if (i == j )  {
                    table[i][j] = 1;
                }
                if ( (j+i) +1 == con){
                    table[i][j]  = 1;
                }
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }

    private static void scanMinMax() {
        int[] tabl = {23, -1, 651, -2, 354, 544, 395, 745, 15, 664};
        int max = 0;
        int min = 0;
        int i = 0;
        for (i = 0; i < tabl.length; i++) {
            if (max < tabl[i]) {
                max = tabl[i];
            }
        }
        for (i = 0; i < tabl.length; i++) {
            if (tabl[i] < min) {
                min = tabl[i];
            }
        }
        System.out.println("min = " + min + " max = " + max);
    }

    public static void plusArray() { //  7


    }
}


