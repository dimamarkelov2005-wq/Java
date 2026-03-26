import javax.swing.*;
import java.awt.*;

public class Task9_Animation extends JPanel {
    private int x = 0;

    public Task9_Animation() {
        Timer timer = new Timer(50, e -> {
            x += 5;
            if (x > getWidth()) x = 0;
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, 100, 50, 50);
    }
}
