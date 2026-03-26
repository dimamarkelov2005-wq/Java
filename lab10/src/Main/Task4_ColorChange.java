import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task4_ColorChange extends JPanel {
    private Color color = Color.RED;

    public Task4_ColorChange() {
        JButton btn4 = new JButton("Сменить цвет");
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (color == Color.RED) color = Color.GREEN;
                else if (color == Color.GREEN) color = Color.BLUE;
                else color = Color.RED;
                repaint();
            }
        });
        this.add(btn4);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(200, 100, 100, 100);
    }
}
