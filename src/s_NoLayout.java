import javax.swing.*;

public class s_NoLayout {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(null);

        JButton button = new JButton("One");
        // устанавливаем расположение (по х и у) и размеры кнопки
        button.setBounds(20, 20, 200, 100);
        panel.add(button);

        panel.revalidate();
    }

}
