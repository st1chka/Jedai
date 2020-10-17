package geekbrains.lesson_1;

import java.util.Scanner;

public class Plate {

    public static int food = 5;

    public static void getFeed() {
        while (Cat.Food() > 0) {

            System.out.println("Насыпать 50 корма? 1-да 2-нет");
            Scanner scanner = new Scanner(System.in);
            int feed = scanner.nextInt();
            if (feed == 1) {
                food = 50;

            }
        }
    }

    public Plate(int food) {

        this.food = food;
    }

    public int decreaseFood(int val) {

        food -= val;
        return food;
    }

    public void info() {
        System.out.println("В тарелке " + food);
    }

    static int getFood() {
        return food;
    }
}