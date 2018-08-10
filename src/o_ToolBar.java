import javax.swing.*;

public class o_ToolBar {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);

        // добавить тулбар с именем toolBar
        JToolBar toolBar = new JToolBar("toolBar");
        // добавить пару кнопок
        JButton one = new JButton("One");
        one.setToolTipText("one");
        JButton two = new JButton("Two");
        two.setToolTipText("two");
        JButton three = new JButton("Three");
        toolBar.add(one);
        toolBar.addSeparator();
        toolBar.add(two);
        toolBar.add(three);
        panel.add(toolBar);

    }

}
