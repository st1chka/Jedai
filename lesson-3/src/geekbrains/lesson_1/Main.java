package geekbrains.lesson_1;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static int value = 1;


    public static void main(String[] args) {
        twoGame();   //Пытаюсь разобраться
//        playGame();
    }


    public static void playGame() {
        int att = 3;
        int i = (int) (Math.random() * 10);
        while (att > 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Угадайте число от 0 до 9, у вас " + att + " попытки!");
            if (scan.hasNextInt()) {
                int num = scan.nextInt();
                System.out.println(i);
                if (i > num) {
                    System.out.println("Загаданное число больше!");
                    att--;
                } else if (i < num) {
                    System.out.println("Загаданное число меньше!");
                    att--;
                } else {
                    System.out.println("Вы угадали!");
                    nextGame();
                }
            } else {
                System.out.println("Вводи только число!");
            }
        }
        while (att == 0) {
            nextGame();
        }
    }


    public static void nextGame() {
        System.out.println("Повторить игру еще раз?\n1 – да\n0 – нет ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            if (scan.nextInt() == value) {
                playGame();
            } else {
                finalGame();
            }
        } else {
            System.out.println("Вводи только число!");
            nextGame();
        }
    }


    public static void finalGame() {
        System.out.println("The End");
        System.exit(0);
    }

    public static void twoGame() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int word = (int) (Math.random() * 26); // рандом слово
        // String str = words[word];
        System.out.println("Угадай слово!");
        System.out.println(words[word]); //выводим рандом слово
        int i = -1;
        int j = -1;
        while (true) {
            Scanner scan = new Scanner(System.in);
            String scanner = scan.nextLine();
            while (i < words[word].length() - 1) {
                while (j < scanner.length() - 1) {
                    i++;
                    j++;
                    if (scanner.charAt(j) != words[word].charAt(i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(words[word].charAt(i));
                    }
                }
//                if (words[word].length().equals (scanner.length())) {
//                    break;
//                }
            }
        }
    }
}
