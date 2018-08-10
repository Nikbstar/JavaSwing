import javax.swing.*;

public class j_TextFields {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        // создать лейбл
        panel.add(new JLabel("this is label"));
        // создать текстовое поле на 20 символов
        panel.add(new JTextField("this is text fild", 20));
        // создать поле для пароля
        panel.add(new JLabel("passowrd: "));
        panel.add(new JPasswordField(20));
        // создать textarea, зафиксировать её и добавить скролл
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setLineWrap(true);
        JScrollPane scroll = new JScrollPane(textArea);
        panel.add(scroll);

        // перерисовать панель
        panel.revalidate();
    }

}
