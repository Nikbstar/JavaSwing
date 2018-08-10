import javax.swing.*;

public class l_Sliders {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
        panel.add(slider);
        // установить палочки со значениями
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(20);
        // нарисовать тики
        slider.setPaintTicks(true);
        // слайдер останавливается только на тиках
        slider.setSnapToTicks(true);
        // показать лейблы
        slider.setPaintLabels(true);
    }

}
