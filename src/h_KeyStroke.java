import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class h_KeyStroke {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        // Создали сочитание клавиш
        KeyStroke key1 = KeyStroke.getKeyStroke("ctrl B");
        // Устанавливаем когда сработает сочитание клавиш
        // WHEN_ANCESTOR_OF_FOCUSED_COMPONENT - когда фокус на компоненте
        // WHEN_IN_FOCUSED_WINDOW - когда фокус на окне
        InputMap inputMap = panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(key1, "changeColor");
        ActionMap actionMap = panel.getActionMap();
        actionMap.put("changeColor", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });
    }

}
