import javax.swing.*;

public abstract class Game {
    abstract JMenuBar  getMenu();
    abstract JFrame getWindow();
    abstract JPanel getForm();

    public void start() {
        JFrame frame = getWindow();
        frame.setJMenuBar(getMenu());
        frame.setContentPane(getForm());
        frame.setVisible(true);
    }
}
