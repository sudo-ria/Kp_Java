
import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;


public class ButtonHandler implements ActionListener {
    private JTextField inputField;
    private JLabel resultLabel;

    public ButtonHandler(JTextField inputField, JLabel resultLabel) {
        this.inputField = inputField;
        this.resultLabel = resultLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        resultLabel.setText("");
        String text = inputField.getText();
        String[] words = text.split(" ");
        if (words[0].length()>18) {
            resultLabel.setText("Первое слово должно быть не больше 18 символов");
            return;
        }
        List<String> words1 = Utils.getWords(words[0], Arrays.copyOfRange(words, 1, words.length));
        if (words1.size() == 0) {
            resultLabel.setText("Слов нет.");
            return;
        }
        resultLabel.setText(StringUtils.join(words1, ", "));
        System.out.println("RESULT:" +  words1);
    }
}
