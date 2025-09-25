package Gamesnake;

import javax.swing.*;

public class Snakgame extends JFrame
{
     Snakgame()
    {
        super("Snake Game");
        add(new Board());
        pack();

        setResizable(false);
        setLocationRelativeTo(null);


    }
    public static void main(String[] args)
    {
        new Snakgame().setVisible(true);


    }
}
