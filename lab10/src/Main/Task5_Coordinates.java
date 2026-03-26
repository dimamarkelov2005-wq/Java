import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task5_Coordinates extends JPanel {
    private int x = 50, y = 50;

    public Task5_Coordinates() {
        JTextField xField = new JTextField(3);
        JTextField yField = new JTextField(3);
        JButton drawBtn = new JButton("Draw");

        drawBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    x = Integer.parseInt(xField.getText());
                    y = Integer.parseInt(yField.getText());
                    repaint();
                } catch (Exception ignored) {}
            }
        });

        this.add(new JLabel("X:"));
        this.add(xField);
        this.add(new JLabel("Y:"));
        this.add(yField);
        this.add(drawBtn);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 50, 50);
    }
}
