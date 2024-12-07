package Training;

import javax.swing.*;

public class GameWindow extends JFrame {
    private JPanel currentScene;

    public GameWindow() {
        setTitle("Adventure Of Titoti");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        currentScene = new Scene1(this);
        add(currentScene);
    }

    public void changeScene(JPanel newScene) {
        remove(currentScene);
        currentScene = newScene;
        add(currentScene);
        revalidate();
        repaint();
    }

    public void start() {
        setVisible(true);
    }
}
