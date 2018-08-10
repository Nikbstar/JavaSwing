import javax.swing.*;
import javax.swing.border.Border;

public class k_RadioButton {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        // checkbox
        panel.add(new JCheckBox("check1"));
        // radiobutton
        JRadioButton radio1 = new JRadioButton("one");
        JRadioButton radio2 = new JRadioButton("two");
        radio2.setSelected(true);
        // поместили их в одну группу
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        // и добавили на панель
        panel.add(radio1);
        panel.add(radio2);
        // комбо боксы
        JComboBox<String> box = new JComboBox<>();
        box.addItem("One");
        box.addItem("Two");
        box.addItem("Free");
        panel.add(box);
        // рамка
        Border border = BorderFactory.createTitledBorder("Border");
        panel.setBorder(border);

    }

}
