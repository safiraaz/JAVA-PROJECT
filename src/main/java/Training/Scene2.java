package Training;

import javax.swing.*;
import java.awt.*;

public class Scene2 extends JPanel {
    private GameWindow window;
    private JLabel narratorText;

    public Scene2(GameWindow window) {
        this.window = window;
        setLayout(null);
        setBackground(Color.BLACK);

        narratorText = new JLabel();
        narratorText.setForeground(Color.WHITE);
        narratorText.setBounds(50,350,750,50);
        narratorText.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(narratorText);

        TypeWritterEffect effect = new TypeWritterEffect(narratorText,"Titoti Sedang Memasak di kantor dengan sebuah kunci yang baik", 50);
        effect.start();
    }
}
