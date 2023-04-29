import javax.swing.*;

public class Words extends Game {

    JPanel getForm(){
        // Создаем панель с менеджером вертикального расположения компонентов
        JPanel form = new JPanel(new VerticalLayout());
        // Добавим кнопки и текстовое поле в панель
        final JTextField inputField = new JTextField(20);
        form.add(inputField);
        JButton btn = new JButton("Проверить");
        form.add(btn);
        final JLabel label = new JLabel("");
        form.add(label);
        btn.addActionListener(new ButtonHandler(inputField, label));
        return form;
    }

    JFrame getWindow(){
        // Создаем окно
        JFrame frame = new JFrame("VerticalLayoutTest");
        // Определяем размеры
        frame.setSize(800, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    //Возвращает меню для программы
    JMenuBar getMenu() {
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("О программе");
        menuBar.add(menu);

        //a group of JMenuItems
        menuItem = new JMenuItem("О разработчике");
        menu.add(menuItem);
        menuItem = new JMenuItem("Справка");
        menu.add(menuItem);
        return menuBar;
    }
}
