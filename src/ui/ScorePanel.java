package ui;

import blackjack.*;

import javax.swing.*;
import java.awt.*;

public class ScorePanel extends JPanel {
    private static final String dealerTitle = "Dealer's score: ";

    private Blackjack game;

    public ScorePanel(Blackjack game) {
        /*setPreferredSize(new Dimension(Blackjack.WIDTH,Blackjack.HEIGHT/3));
        setBackground(new Color(100,100,0));
        this.game = game;*/
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
    }

    // draws the boxes for record and dealer stuff
    private void drawBoxes(Graphics g) {
    }

    private void gameOver(Graphics g) {
    }


}
