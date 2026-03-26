import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Task6_Mouse extends JPanel {
    private int x = 0, y = 0;

    public Task6_Mouse() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 5, 5);
        g.drawString("X: " + x + " Y: " + y, 10, 20);
    }
}
