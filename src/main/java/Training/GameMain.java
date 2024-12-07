package Training;

import javax.swing.*;

public class GameMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameWindow game = new GameWindow();
            game.start();
        });
    }
}


// WE HAVE AN ISSUE ABOUT CLICKING LOT