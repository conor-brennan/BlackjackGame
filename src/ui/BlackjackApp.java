package ui;

import blackjack.*;

import javax.swing.*;

public class BlackjackApp extends JFrame{
    private Blackjack game;

    public BlackjackApp() {
        /*super("Space Invaders");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);*/
        game = new Blackjack();
    }


    public static void main(String[] args) {
        new BlackjackApp();
    }
}
