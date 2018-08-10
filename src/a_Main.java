import javax.swing.*;
import java.awt.*;

public class a_Main {

    // Настройки стартового окна
    public static JFrame getFrame() {
        // Создаем новый кадр
        JFrame frame = new JFrame();
        // Выход, при нажатии на крестик
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Считываем размеры экрана пользователя
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        // задаем размеры окна
        int wWidth = 500;
        int wHeight = 400;
        // устанавливаем позицию и размер окна
        frame.setBounds(dimension.width / 2 - wWidth / 2, dimension.height / 2 - wHeight / 2, wWidth, wHeight);
        // делаем окно видимым
        frame.setVisible(true);
        return frame;
    }

}
