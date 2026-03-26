import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task8_Calculator extends JPanel {
    private JTextField t1, t2;
    private JLabel result;

    public Task8_Calculator() {
        t1 = new JTextField(5);
        t2 = new JTextField(5);
        result = new JLabel("0");

        JButton addBtn = new JButton("+");
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    result.setText(String.valueOf(a + b));
                } catch (Exception ignored) {}
            }
        });

        this.add(t1);
        this.add(t2);
        this.add(addBtn);
        this.add(result);
    }
}
