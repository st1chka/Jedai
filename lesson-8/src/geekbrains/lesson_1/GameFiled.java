package geekbrains.lesson_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.SimpleTimeZone;

public class GameFiled extends JPanel implements ActionListener {


    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] x = new int[400];
    private int[] y = new int[400];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;

    public GameFiled() {
        this.setBackground(Color.black);
        this.loadImages();
        this.initGame();
        this.addKeyListener(new GameFiled.FieldKeyListenner());
        this.setFocusable(true);

    }

    public void initGame() {
        dots = 3;
        for (int i = 0; i < dots; i++) {
            x[i] = 48 - i * DOT_SIZE;
            x[i] = 48;
        }
// скорость змейки
        timer = new Timer(250, this);
        timer.start();
        createApple();
        chekInGame();

    }

    public void createApple() {
        appleX = new Random().nextInt(20) * DOT_SIZE;
        appleY = new Random().nextInt(20) * DOT_SIZE;
    }

    public void loadImages() {
        ImageIcon iia = new ImageIcon("E:/java lesson/GB/lesson-8/Apple.jpg");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("E:/java lesson/GB/lesson-8/Snake.jpg");
        dot = iid.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (inGame) {
            g.drawImage(apple, appleX, appleY, this);
            for (int i = 0; i < dots; i++) {
                g.drawImage(dot, x[i], y[i], this);
            }
        } else {

            String str = "Конец";
            g.setColor(Color.white);
            g.drawString(str, 225, 250);
        }
    }


    public void move() {
        for (int i = dots; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        if (left) {
            x[0] -= DOT_SIZE;
        }
        if (right) {
            x[0] += DOT_SIZE;
        }
        if (up) {
            y[0] -= DOT_SIZE;
        }
        if (down) {
            y[0] += DOT_SIZE;
        }
    }

    public void checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            dots++;
            createApple();
        }

    }

    public void checkCollisions() {
        for (int i = dots; i > 0; i--) {
            if (i > 4 && x[0] == x[i] && y[0] == y[i]) {
                inGame = false;

            }
        }
        if (x[0] > SIZE || x[0] < 0 || y[0] > SIZE || y[0] < 0) {
            inGame = false;

        }
    }


    public void chekInGame() {


        GridLayout layout = new GridLayout(1, 2);

        JButton batRest = new JButton("Новая игра");
        add(batRest, BorderLayout.SOUTH);

        if(inGame){
            batRest.setVisible(false);
        } else {
            batRest.setVisible(true);
        }


        JButton batExit = new JButton("Выход");

        add(batExit, BorderLayout.SOUTH);

        if(inGame){

            batExit.setVisible(false);
        } else {
            batExit.setVisible(true);

        }

        batRest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//            initGame();
                Window window = new Window();
            }
        });
        batExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(404);
            }
        });


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            chekInGame();
            checkApple();
            checkCollisions();
            move();
            chekInGame();
        }
        repaint();

    }

    class FieldKeyListenner extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_LEFT && !right) {
                left = true;
                up = false;
                down = false;
            }
            if (key == KeyEvent.VK_RIGHT && !left) {
                right = true;
                up = false;
                down = false;
            }
            if (key == KeyEvent.VK_UP && !down) {
                up = true;
                right = false;
                down = false;
            }
            if (key == KeyEvent.VK_DOWN && !up) {
                right = false;
                down = true;
                left = false;
            }
        }
    }

}
