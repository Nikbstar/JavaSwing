import javax.swing.*;

public class u_Focus {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);

        panel.add(new JButton("One"));
        // запретить фокус на эту кнопку
        panel.add(new JButton("Two")).setFocusable(false);
        // установить стартовый фокус на эту кнопку
        panel.add(new JButton("Three")).requestFocusInWindow();

        panel.revalidate();
    }

}
