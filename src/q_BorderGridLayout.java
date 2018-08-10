import javax.swing.*;
import java.awt.*;

public class q_BorderGridLayout {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
//        // border layout
//        // вместо кнопок можно разместить панельки и на них уже располагать кнопки
//        frame.add(new JButton("one"), BorderLayout.NORTH);
//        frame.add(new JButton("two"), BorderLayout.WEST);
//        frame.add(new JButton("three"), BorderLayout.SOUTH);
//        frame.add(new JButton("four"), BorderLayout.EAST);
//        frame.add(new JButton("five"), BorderLayout.CENTER);
        // grid layout - таблица (в данном случае 2 х 2)
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(2, 2));
        panel.add(new JButton("One"));
        panel.add(new JButton("Two"));
        panel.add(new JButton("Three"));
        panel.add(new JButton("Four"));
        panel.revalidate();
    }

}
