import javax.swing.*;
import java.awt.*;

public class r_GridBagLayout {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);

        GridBagConstraints consTextArea = new GridBagConstraints();
        // минимальный размер (чтоб сам растягивался)
        consTextArea.weightx = 0;
        consTextArea.weighty = 0;
        // с какой клетки начать расположение
        consTextArea.gridx = 0;
        consTextArea.gridy = 0;
        // сколько клеток будет занимать
        consTextArea.gridheight = 2;
        consTextArea.gridwidth = 2;
        panel.add(new JTextArea(4, 20), consTextArea);

        GridBagConstraints consButton1 = new GridBagConstraints();
        // минимальный размер (чтоб сам растягивался)
        consButton1.weightx = 0;
        consButton1.weighty = 0;
        // с какой клетки начать расположение
        consButton1.gridx = 2;
        consButton1.gridy = 0;
        // сколько клеток будет занимать
        consButton1.gridheight = 1;
        consButton1.gridwidth = 2;
        panel.add(new JButton("one"), consButton1);

        GridBagConstraints consButton2 = new GridBagConstraints();
        // минимальный размер (чтоб сам растягивался)
        consButton2.weightx = 0;
        consButton2.weighty = 0;
        // с какой клетки начать расположение
        consButton2.gridx = 2;
        consButton2.gridy = 1;
        // сколько клеток будет занимать
        consButton2.gridheight = 1;
        consButton2.gridwidth = 1;
        panel.add(new JButton("two"), consButton2);

        GridBagConstraints consButton3 = new GridBagConstraints();
        // минимальный размер (чтоб сам растягивался)
        consButton3.weightx = 0;
        consButton3.weighty = 0;
        // с какой клетки начать расположение
        consButton3.gridx = 3;
        consButton3.gridy = 1;
        // сколько клеток будет занимать
        consButton3.gridheight = 1;
        consButton3.gridwidth = 1;
        panel.add(new JButton("one"), consButton3);

        panel.revalidate();
    }

}
