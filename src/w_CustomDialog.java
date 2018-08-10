import javax.swing.*;
import java.awt.*;

public class w_CustomDialog {
    static JFrame frame = a_Main.getFrame();
    static JPanel panel = new JPanel();

    public static void main(String[] args) {
        frame.add(panel);
        JButton button = new JButton("show dialog");
        panel.add(button);
        button.addActionListener(e -> new MyDialog());

        panel.revalidate();
    }

    static class MyDialog extends JDialog {
        public MyDialog() {
            super(frame, "title", true);
            add(new JTextField(), BorderLayout.NORTH);
            add(new JButton("button"), BorderLayout.SOUTH);
            setBounds(150, 150, 200, 150);
            setVisible(true);
        }
    }

}
