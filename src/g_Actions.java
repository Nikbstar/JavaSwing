import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class g_Actions {
    static JFrame frame = a_Main.getFrame();
    static JPanel panel = new JPanel();

    public static void main(String[] args) {
        frame.add(panel);
        JButton button = new JButton(new MyAction());
        button.setText("OK");
        panel.add(button);
    }

    // Делает действие, которое можно использовать на нескольких кнопках
    static class MyAction extends AbstractAction {

        MyAction() {
            putValue(AbstractAction.SHORT_DESCRIPTION, "My short discription");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.RED);
        }

    }
}
