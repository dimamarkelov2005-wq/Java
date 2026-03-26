import javax.swing.*;
import java.awt.*;

public class Task1_Figures extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 150, 100);
        g.drawString("Прямоугольник", 50, 40);

        g.drawOval(250, 50, 100, 100);
        g.drawString("Круг", 250, 40);

        g.drawLine(50, 200, 200, 200);
        g.drawString("Линия", 50, 190);
    }
}
