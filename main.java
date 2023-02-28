import javax.swing.*;
import java.awt.*;

public class main extends JFrame {
    public static void main(String[] args) {
        JFrame ageC = new JFrame("Age Calculator");

        JButton okButton = new JButton("OK");
        okButton.setBounds(230, 250, 100, 80);

        ageC.setResizable(false);
        ageC.setSize(300, 300);
        ageC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ageC.add(okButton);

        JTextArea head = new JTextArea("Nhập tuổi của bạn");
        head.setFont(new Font("SVN-ProductSans", Font.BOLD, 30));
        head.setEditable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(150,50));

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(textField, BorderLayout.CENTER);

        panel.add(head, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(okButton, BorderLayout.SOUTH);

        ageC.add(panel);
        ageC.setVisible(true);
        //String age = textField.getText();
        okButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"Số tuổi của bạn là: " + textField.getText());
        });


    }
}
