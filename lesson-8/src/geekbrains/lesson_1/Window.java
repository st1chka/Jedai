package geekbrains.lesson_1;

import javax.swing.*;

public class Window extends JFrame {
    public Window(){

// параметры окна
        setTitle("Змеюка");
        setLocation( 400,400);
        setSize(500,500);
        add(new GameFiled());
        super.setVisible(true);
        setResizable(false);
//закрытие при крестике
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }





}
