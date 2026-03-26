import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task3_TextField extends JPanel {
    private JTextField tf;
    private JLabel label3;

    public Task3_TextField() {
        tf = new JTextField(10);
        label3 = new JLabel("");

        JButton btn3 = new JButton("OK");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label3.setText("Привет, " + tf.getText());
            }
        });

        this.add(tf);
        this.add(btn3);
        this.add(label3);
    }
}
