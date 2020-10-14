package geekbrains.lesson_1;

public class Animals {
    //действия
    double run;
    double jump;

    //имена
    String name;

    //ограничения
    double maxrun;
    double maxjump;


    Animals(String name, double run, double jump) {
        this.jump = jump;
        this.run = run;
        this.name = name;
    }

    void moveRun() {
        if (run > maxrun) {
            System.out.println(name + "  НЕ может пробежать эту дистанцию");
        } else {
            System.out.println(name + " пробежал дистанцию " + run + "м.");
        }
    }


    void moveJump() {
        if (jump > maxjump) {
            System.out.println(name + "  НЕ может прыгуть на эту высоту");
        } else {
            System.out.println(name + " прыгнул на высоту " + jump + "м.");
        }
    }


}
