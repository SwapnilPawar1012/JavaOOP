import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Project extends JFrame implements ActionListener {
    private JTextField textfield1, textfield2, resultfield;
    private JPanel panel;
    private JLabel label1, label2, resultlabel;
    private JButton addbtn, subbtn, clrbtn;

    public GUI_Project() {
        setTitle("Number Addition and Subtraction");
        setLayout(null);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("First number");
        label1.setBounds(10, 40, 120, 20);
        label1.setFont(new Font("Arial", Font.BOLD, 16));

        textfield1 = new JTextField();
        textfield1.setBounds(140, 40, 140, 20);

        label2 = new JLabel("Second number");
        label2.setBounds(10, 70, 120, 20);
        label2.setFont(new Font("Arial", Font.BOLD, 16));

        textfield2 = new JTextField();
        textfield2.setBounds(140, 70, 140, 20);

        resultlabel = new JLabel("Result");
        resultlabel.setBounds(10, 100, 120, 20);
        resultlabel.setFont(new Font("Arial", Font.BOLD, 16));

        resultfield = new JTextField();
        resultfield.setBounds(140, 100, 140, 20);
        resultfield.setEditable(false);

        addbtn = new JButton("Add");
        addbtn.setBounds(60, 150, 80, 30);
        addbtn.addActionListener(this);

        subbtn = new JButton("Subtract");
        subbtn.setBounds(160, 150, 100, 30);
        subbtn.addActionListener(this);

        clrbtn = new JButton("Clear");
        clrbtn.setBounds(270, 150, 80, 30);
        clrbtn.addActionListener(this);

        panel = new JPanel();
        panel.setBounds(100, 60, 400, 200);
        panel.setLayout(null);

        panel.add(label1);
        panel.add(textfield1);
        panel.add(label2);
        panel.add(textfield2);
        panel.add(resultlabel);
        panel.add(resultfield);
        panel.add(addbtn);
        panel.add(subbtn);
        panel.add(clrbtn);

        add(panel);

        setVisible(true);
    }

    public static void main(String args[]) {
        new GUI_Project();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addbtn) {
            performOperation("+");
        } else if (e.getSource() == subbtn) {
            performOperation("-");
        } else if (e.getSource() == clrbtn) {
            clearFields();
        }
    }

    private void performOperation(String operation) {
        try {
            double num1 = Double.parseDouble(textfield1.getText());
            double num2 = Double.parseDouble(textfield2.getText());
            double result;

            if (operation.equals("+")) {
                result = num1 + num2;
            } else {
                result = num1 - num2;
            }

            resultfield.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter numeric values.");
        }
    }

    private void clearFields() {
        textfield1.setText("");
        textfield2.setText("");
        resultfield.setText("");
    }
}
