package geekbrains.lesson_1;

public class Cat {

    private String name;
    private int appetite;

    String cats;


    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
    }





    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    int getAppetite() {
        return this.appetite;
    }

    String getName() {
        return this.name;
    }
}