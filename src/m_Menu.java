import javax.swing.*;

public class m_Menu {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        menuBar.add(file);
        menuBar.add(edit);

        // Добавить элемент в меню файл
        file.add(new JMenuItem("Open"));
        // Добавить элемент с иконкой
        //file.add(new JMenuItem("Open", new ImageIcon("")));
        // поставить мнимоник на какую то букву
        file.add(new JMenuItem("Save", 'S'));
        // добавить разделитель
        file.addSeparator();
        // file.add возвращает тот же объект
        JMenuItem exit = file.add(new JMenuItem("Exit"));
        // повешать какое либо действие
        exit.addActionListener(e -> {
            System.exit(0);
        });
        // добавить сочитание клавиш
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));

        // выключить пункт меню
        JMenuItem copy = edit.add(new JMenuItem("Copy"));
        // отключить пункт меню
        copy.setEnabled(false);
        edit.add(new JMenuItem("Cut"));
        edit.add(new JMenuItem("Paste"));
        // добавить подменю
        JMenu options = new JMenu("Options");
        options.add("One");
        options.add("Two");
        edit.add(options);
        edit.addSeparator();
        // добавить в меню чекбокс
        edit.add(new JCheckBoxMenuItem("Check Box"));
        edit.addSeparator();
        // добавить в меню радио
        ButtonGroup group = new ButtonGroup();
        JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("radio1");
        JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("radio2");
        radio1.setSelected(true);
        group.add(radio1);
        group.add(radio2);
        edit.add(radio1);
        edit.add(radio2);

        frame.setJMenuBar(menuBar);
        frame.revalidate();

    }

}
