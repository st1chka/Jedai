package geekbrains.lesson_1;

import java.util.Scanner;

public class Dog extends Animals {

    double swim;
    double maxswim;


    Dog(String name, double run, double jump, double swim) {

        super(name, run, jump);
        this.swim = swim;

    }
//    @Override
//    void moveRun(){
//        if (run > maxrun) {
//            System.out.println(name + "  НЕ может пробежать эту дистанцию");
//        } else {
//            System.out.println(name + " пробежал дистанцию " + run + "м.");
//        }
//    }
//    @Override
//    void moveJump() {
//        if (jump > maxjump) {
//            System.out.println(name + "  НЕ может прыгуть на эту высоту");
//        } else {
//            System.out.println(name + " прыгнул на высоту " + jump + "м.");
//        }
//    }

    void moveSwim() {
        if (swim > maxswim) {
            System.out.println(name + "  НЕ может прпоплыть  дистанцию в " + swim + "м.");
        } else {
            System.out.println(name + " проплыл " + swim + "м.");
        }
    }


}
