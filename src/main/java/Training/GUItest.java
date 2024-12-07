package Training;

import javax.swing.JOptionPane;

public class GUItest {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Do you love me?");
        System.out.println(str);
        String str2 = JOptionPane.showInputDialog("Do you marry me?");
        System.out.println(str2);

        JOptionPane.showMessageDialog(null, "Hello World", "Greetings ravel", 1);
    }
}
