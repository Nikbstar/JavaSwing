import javax.swing.*;

public class n_PopupMenu {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);

        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(new JMenuItem("One"));
        popupMenu.add(new JMenuItem("Two"));
        panel.setComponentPopupMenu(popupMenu);
    }

}
