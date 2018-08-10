import javax.swing.*;

public class v_Dialogs {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);

        // showMessageDialog
        JButton button1 = new JButton("showMessageDialog");
        panel.add(button1);
        button1.addActionListener(e -> {
            // вывести сообщение перед panel, с текстом, заголовком и значком ошибки
            JOptionPane.showMessageDialog(panel, "this is my dialog", "title", JOptionPane.ERROR_MESSAGE);
        });

        // showConfirmDialog
        JButton button2 = new JButton("showConfirmDialog");
        panel.add(button2);
        button2.addActionListener(e -> {
            // возвращает результат в зависимости от выбранного решения в диалоге
            // на какую панель, сообщение, заголовок и выбираем какие кнопки будут отображены
            int result = JOptionPane.showConfirmDialog(panel, "showConfirmDialog", "title", JOptionPane.YES_OPTION);
            System.out.println(result);
        });

        // showOptionDialog
        JButton button3 = new JButton("showOptionDialog");
        panel.add(button3);
        button3.addActionListener(e -> {
            // то же самое что и предыдущее, только кнопки передаём сами в массиве
            int result = JOptionPane.showOptionDialog(panel, "showOptionDialog", "title", 0, 0, null, new Object[] {"one", "two", "three"}, "two");
            System.out.println(result);
        });

        // showInputDialog
        JButton button4 = new JButton("showInputDialog");
        panel.add(button4);
        button4.addActionListener(e -> {
            // возвращает введённую строку или null, если нажали отмена
            String result = JOptionPane.showInputDialog(panel, "showInputDialog");
            System.out.println(result);
        });


        panel.revalidate();
    }

}
