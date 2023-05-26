import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Verifica extends JFrame {
    private ArrayList<Integer> numbers;
    private JTextArea numbersTextArea;
    private JTextField numberTextField;

    public Verifica() {
        numbers = new ArrayList<>();
        setTitle("Verifica");
        setSize(300, 300);     
        JPanel mainPanel = new JPanel(new BorderLayout()); 
        JPanel inputPanel = new JPanel();
        numberTextField = new JTextField(10);
        JButton addButton = new JButton("Aggiungi");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = numberTextField.getText();
                if (isValidInteger(input)) {
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                    updateNumbersTextArea();
                    numberTextField.setText("");
                } else {
                    JOptionPane.showMessageDialog(Verifica);
                }
            }
        });
        inputPanel.add(numberTextField);
        inputPanel.add(addButton);
        JButton sortButton = new JButton("Visualizza in ordine crescente");
        public void actionPerformed(ActionEvent e) {
                ArrayList<Integer> sortedNumbers = new ArrayList<>(numbers);
                Collections.sort(sortedNumbers);
                showNumbersDialog("Numeri in ordine crescente:", sortedNumbers);
            }

    private void updateNumbersTextArea() {
        numbersTextArea.setText("");
        for (int number : numbers) {
            numbersTextArea.append(number + "");
        }
    }

    private void showNumbersDialog(String title, ArrayList<Integer> numbersList) {
        StringBuilder message = new StringBuilder();
        for (int number : numbersList) {
            message.append(number).append("");
        }
        JOptionPane.showMessageDialog(this, message.toString(), title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Verifica::new);
    }
}