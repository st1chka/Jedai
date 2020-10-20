package geekbrains.lesson_1;


public class Main {


    public static void main(String[] args) {

        Plate.getFeed();


    }
    public static int Food() {

        Plate plate = new Plate(Plate.getFood());
        plate.info();
        boolean satiety; //false
//
//        int cat = 4;
//        int ate;
//

        int x = 0;
        int j = 0;

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Мурка", 12, false);
        cats[1] = new Cat("Кеша", 13, false);
        cats[2] = new Cat("Барсик", 5, false);
        cats[3] = new Cat("Петрович", 15, false);
        cats[4] = new Cat("Михалыч", 1, false);

        for (int i = 0; i < cats.length; i++) {
            if ((cats[i].getAppetite() > Plate.getFood())) {
                System.out.println(cats[i].getName() + " хочет " + cats[i].getAppetite() + ", а в тарелке меньше! (" + Plate.getFood() + ")");
                j++;

            } else {
                x = cats[i].getAppetite();
                System.out.println(cats[i].getName() + " поел(а) " + cats[i].getAppetite() + " (" + plate.decreaseFood(x) + ")");
                satiety = true;
            }
        }

        System.out.println("Голодных котиков " + j);
        return j;
    }
}


