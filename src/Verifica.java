import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Verifica extends JFrame {

    private JTextField numberTextField;
    private JTextArea outputTextArea;
    private ArrayList<Integer> numbersList;

    public Verifica() {
        numbersList = new ArrayList<>();

        setTitle("Verifica");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        JLabel numberLabel = new JLabel("Numero:");
        numberTextField = new JTextField(10);
        JButton addButton = new JButton("Aggiungi");
        addButton.addActionListener(new AddButtonListener());
        outputTextArea = new JTextArea(10, 30);
        outputTextArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(numberLabel);
        panel.add(numberTextField);
        panel.add(addButton);
