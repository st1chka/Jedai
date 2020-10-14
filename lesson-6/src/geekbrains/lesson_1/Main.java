package geekbrains.lesson_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//-------------------------------------------------------------------------------------------------------

        Cat cat1 = new Cat("Котя", 200, 2);
        cat1.maxrun = 200;
        cat1.maxjump = 2;

        cat1.moveRun();
        cat1.moveJump();


//-------------------------------------------------------------------------------------------------------

        Dog dog1 = new Dog("Макс", 250, 1, 2);
        dog1.maxrun = 500;
        dog1.maxjump = 0.5;
        dog1.maxswim = 10;

        dog1.moveRun();
        dog1.moveJump();
        dog1.moveSwim();


//-------------------------------------------------------------------------------------------------------

        Dog dog2 = new Dog("Шарик", 600, 2, 16);
        dog2.maxrun = 700;
        dog2.maxjump = 3;
        dog2.maxswim = 15;

        dog2.moveRun();
        dog2.moveJump();
        dog2.moveSwim();

//-------------------------------------------------------------------------------------------------------

    }
}
