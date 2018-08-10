import javax.swing.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class d_EventHandler01 {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("Submit");
        panel.add(button);
        // то же самое что и в c_ActionListener, только в одну строчку
        button.addActionListener(EventHandler.create(ActionListener.class, frame, "title", "source.text"));
    }

}
