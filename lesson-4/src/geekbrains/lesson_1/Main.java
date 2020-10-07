package geekbrains.lesson_1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static char[][] map;
    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3; //3 символа в ряд победа

    static final char DOT_EMPTY = '.';
    static final char DOT_O = 'O';
    static final char DOT_X = 'X';

    public static void main(String[] args) {

        //1. Инициализация поля
        initMap();
        //1.1 вывод поля
        printMap();
        // в цикле
        while (true) {
            makeHumanTurn(); //3.Ход первого игрока
            printMap(); //4.Вывод поля
            if (hasWin(DOT_X)) { //5.Проверка на 3 в ряд
                System.out.println("Победа человеков!!");
                break;
            }
            if (isMapFull()) {  //6. Проверка на ничью
                System.out.println("Ничья!");
                break;
            }
            makeAiTurn();   //7.Ход второго игрока
            printMap();
            if (hasWin(DOT_O)) {
                System.out.println("Киборг убийца победил");
                break;
            }
            if (isMapFull()) {  //6. Проверка на ничью
                System.out.println("Ничья!");
                break;
            }
        }
    }

    //1.Инициализация
    static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {

            System.out.print((i + 1) + " ");

            for (int j = 0; j < map[i].length; j++) {

                System.out.print(map[i][j] + " ");

            }

            System.out.println();
        }
    }

    //ход человека
    static void makeHumanTurn() {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        do {
            System.out.println("Введи коорджинаты в формате Х  У");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    //Ход Киборга убийцы
    static void makeAiTurn() {

        Random random = new Random();
        int x;
        int y;
        do {
            System.out.println("Киборг, сделай ход! Х  У");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Киборг убийца сделал ход" + (x + 1) + " " + (y + 1));

        map[y][x] = DOT_O;
    }

    //проверка хода
    static boolean isCellValid(int x, int y) {

        if (x < 0 || x > SIZE || y < 0 || y >= SIZE) {

            return false;

        } else if (map[y][x] == DOT_EMPTY) {

            return true;

        } else {

            return false;

        }
    }

    //проверка на победу
    static boolean hasWin(char symb) {


        //проверка по строкам


        //проверка по столбам

        int steps = 0;

        for (int i = 0; i < SIZE; i++) {

            int stepsLine = 0;
            int stepsColumn = 0;

            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    stepsLine++;
                    if (stepsLine == DOTS_TO_WIN) {
                        return true;
                    }
                }
                if (map[j][i] == symb) {
                    stepsColumn++;
                    if (stepsColumn == DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
        }

//        //проверка по диагоналям

        int stepsDiagonal = 0;
        // по побочной
        for (int i = 0; i < SIZE; i++) {
            for (int j = 2; j >= 0; j--) {

                if (map[i][j] == symb) {
                    stepsDiagonal++;
                    if (stepsDiagonal == DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
        }

        //по основной
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == symb && i == j) {
                    steps++;
                    if (steps == DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
        }


        return false;
    }

    //ничка

    static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}
