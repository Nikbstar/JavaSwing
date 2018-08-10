import javax.swing.*;

public class e_LookAndFeel {

    public static void main(String[] args) {
//        // посмотреть список установленных LookAndFeels
//        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
//        for (UIManager.LookAndFeelInfo info : infos) {
//            System.out.println(info.getName());
//            System.out.println(info.getClassName());
//            System.out.println("+++++++++++++++++++");
//        }
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button1 = new JButton("Metal");
        JButton button2 = new JButton("Nimbus");
        JButton button3 = new JButton("Motif");
        JButton button4 = new JButton("Windows");
        JButton button5 = new JButton("Windows Classic");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        button1.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
        button2.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
        button3.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
        button4.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
        button5.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
    }

}
