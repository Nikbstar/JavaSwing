import javax.swing.*;
import java.awt.*;

public class c_ActionListener {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        // Добавляем на главное окно новую панельку
        JPanel panel = new JPanel();
        frame.add(panel);
        // добавляем кнопку на панель
        JButton button = new JButton("Submit");
        // задаем действие при нажатии на кнопку
        button.addActionListener(e -> {
            panel.setBackground(Color.BLUE);
        });
        panel.add(button);
    }

}
