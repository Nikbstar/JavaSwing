import javax.swing.*;
import java.awt.*;

public class t_CustomLayout {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new MyLayout());
        panel.add(new JButton("One"));
        panel.add(new JButton("Two"));
        panel.add(new JButton("Three"));
        panel.add(new JButton("Four"));



        panel.revalidate();
    }

    static class MyLayout implements LayoutManager {

        @Override
        public void addLayoutComponent(String name, Component comp) {

        }

        @Override
        public void removeLayoutComponent(Component comp) {

        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            return null;
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return null;
        }

        @Override
        public void layoutContainer(Container parent) {
            for (int i = 0; i < parent.getComponentCount(); i++) {
                Component com = parent.getComponent(i);
                com.setBounds(i * 100, i * 40, 100, 40);
            }
        }
    }

}
