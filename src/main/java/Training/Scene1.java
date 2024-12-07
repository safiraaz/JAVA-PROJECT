package Training;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scene1 extends JPanel{
    private GameWindow window;
    private JLabel narratorText;

    public Scene1(GameWindow window) {
        this.window = window;
        setLayout(null);
        setBackground(Color.BLACK);

        narratorText = new JLabel();
        narratorText.setForeground(Color.WHITE);
        narratorText.setBounds(50,350,750,50);
        narratorText.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(narratorText);

        TypeWritterEffect effect = new TypeWritterEffect(narratorText,"Anda menemukan artefak kuno di tengah gua...", 50);
        effect.start();

//        JButton btnReturnArtifact = new JButton("Return Artifact");
//        btnReturnArtifact.setBounds(100, 250, 200,50);
//        btnReturnArtifact.addActionListener(new ActionListener(e ->
//                ) {
//        });

        //pilihan tombol
        JButton btnTakeArtifact = new JButton("Take Artifact");
        btnTakeArtifact.setBounds(50,250,200,50);
        btnTakeArtifact.addActionListener(e -> {
            TypeWritterEffect newEffect = new TypeWritterEffect (
                    narratorText,
                    "Anda memutuskan untuk mempertahankan artefak. Perjalanan pun dilanjutkan tanpa arah...",
                    50
            );
            newEffect.start();

            // Pindah ke scene berikutnya setelah efek selesai
            Timer delay = new Timer(5000, evt -> window.changeScene(new Scene2(window))); // 10 detik
            delay.setRepeats(false);
            delay.start();
        });
        add(btnTakeArtifact);
    }
}