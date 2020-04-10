package ui;

import blackjack.*;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel {
    private Blackjack game;

    public PlayerPanel(Blackjack game) {
        setPreferredSize(new Dimension(Blackjack.WIDTH,Blackjack.HEIGHT/3));
        setBackground(new Color(100,100,0));
        this.game = game;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawGame(g);

        if (game.isOver()) {
            gameOver(g);
        }
    }


    // draws the game onto g
    private void drawGame(Graphics g) {
        drawBoxes(g);
        drawCards(g);
        createButtons();
    }

    // draws the boxes for hit, stay, score, and cards
    private void drawBoxes(Graphics g) {
        drawScore(g);
    }

    // draws cards onto its appropriate box
    private void drawCards(Graphics g) {
    }

    // creates buttons for hit and stay
    private void createButtons() {
    }

    // draws player score on appropriate box
    private void drawScore(Graphics g) {
    }

    private void gameOver(Graphics g) {
    }
}
