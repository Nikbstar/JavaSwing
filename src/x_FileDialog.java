import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;

public class x_FileDialog {

    public static void main(String[] args) {
        JFrame frame = a_Main.getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);

        JButton button = new JButton("show file dialog");
        panel.add(button);
        button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            // установить директорию по умолчанию
            fileChooser.setCurrentDirectory(new File("."));
            // возможность выбрать несколько файлов
            fileChooser.setMultiSelectionEnabled(true);
            // установить что можно выбирать
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            // фильтры на файлы
            fileChooser.setFileFilter(new FileFilter() {
                @Override
                public boolean accept(File f) {
                    return f.isDirectory() || f.getName().endsWith("gif");
                }

                @Override
                public String getDescription() {
                    return "only gif files";
                }
            });
            // что то делать при выдилении файла в диалоге (например можно показывать картинку
            fileChooser.addPropertyChangeListener(evt -> {
                System.out.println(evt.toString());
            });

//            // открыть обычный файловый диалог
//            fileChooser.showOpenDialog(panel);
//            // открыть диалог для сохранения файла
//            fileChooser.showSaveDialog(panel);
            // диалог со своими кнопками
            System.out.println(fileChooser.showDialog(panel, "save as..."));

            // получить выбранный файл
            fileChooser.getSelectedFile();
        });

        panel.revalidate();

    }

}
