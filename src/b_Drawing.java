import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class b_Drawing {
    public static void main(String[] args) {
        JFrame jFrame = a_Main.getFrame();
        // Добавляем на форму наш компонент, в котором можно рисовать.
        jFrame.add(new MyComponent());
    }

    // клас нового компонента, в котором можно рисовать
    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            // преобразовываем устаревший Graphics в Graphics2D
            Graphics2D g2 = (Graphics2D)g;
//        // Посмотреть список доступных шрифтов в системе
//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        for (String font : fonts) {
//            System.out.println(font);
//        }
            // задаем шрифт
            Font font = new Font("Arial", Font.BOLD, 20);
            // устанавливаем его в компонент
            g2.setFont(font);
            // рисуем строку в заданных координатах
            g2.drawString("Hello world!", 20, 40);
            // рисование линии по двум точкам
            Point2D p1 = new Point2D.Float(50f, 50f);
            Point2D p2 = new Point2D.Float(220f, 220f);
            Line2D l2 = new Line2D.Float(p1, p2);
            g2.draw(l2);
            // рисуем эллипс
            Ellipse2D ellipse2D = new Ellipse2D.Float();
            ellipse2D.setFrameFromDiagonal(p1, p2);
            g2.draw(ellipse2D);
            // Закрасить эллипс зелёным
            g2.setPaint(Color.GREEN);
            g2.fill(ellipse2D);
            g2.setPaint(Color.BLACK);
            // исуем квадрат
            Rectangle2D rectangle2D = new Rectangle2D.Float();
            rectangle2D.setFrameFromDiagonal(p1, p2);
            g2.draw(rectangle2D);
            // Вставляем рисунок
            //                // из инета
//                URL url = new URL("https://www.softexia.com/wp-content/uploads/2017/04/Java-logo.png");
//                Image image = new ImageIcon(url).getImage();
            // локальную
            Image image = new ImageIcon("Java-logo.png").getImage();
            g2.drawImage(image, 250, 100, null);


        }
    }

}
