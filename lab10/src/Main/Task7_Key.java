import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Task7_Key extends JPanel {
    private JLabel keyLabel;

    public Task7_Key() {
        keyLabel = new JLabel("Нажмите клавишу");
        this.add(keyLabel);
        this.setFocusable(true);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                keyLabel.setText("Нажато: " + e.getKeyChar());
            }
        });
    }
}
