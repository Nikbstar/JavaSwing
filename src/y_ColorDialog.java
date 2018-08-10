import javax.swing.*;
import java.awt.*;

public class y_ColorDialog {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("color");
        panel.add(button);
        button.addActionListener(e -> {
            Color color = JColorChooser.showDialog(panel, "title", Color.BLUE);
            panel.setBackground(color);
            panel.revalidate();
        });
        panel.revalidate();
    }
}
