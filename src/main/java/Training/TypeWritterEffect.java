package Training;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TypeWritterEffect {
    private JLabel label;
    private String fullText;
    private int index;
    private Timer timer;

    public TypeWritterEffect(JLabel label, String text, int Delay) {
        this.label = label;
        this.fullText = text;
        this.index = 0;

        timer = new Timer(Delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(index < fullText.length()) {
                    label.setText(label.getText() + fullText.charAt(index));
                    index++;
                } else {
                    timer.stop();
                }
            }
        });
    }

    public void start() {
        label.setText("");
        index = 0;
        timer.start();
    }
}
