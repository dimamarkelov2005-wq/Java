import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task2_Button extends JPanel {
    private JLabel label2;

    public Task2_Button() {
        label2 = new JLabel("");
        JButton btn2 = new JButton("Нажми");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setText("Hello Java");
            }
        });
        this.add(btn2);
        this.add(label2);
    }
}
