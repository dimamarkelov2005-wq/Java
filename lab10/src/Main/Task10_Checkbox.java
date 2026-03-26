import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Task10_Checkbox extends JPanel {
    private Color color = Color.BLACK;

    public Task10_Checkbox() {
        JCheckBox red = new JCheckBox("Красный");
        JCheckBox green = new JCheckBox("Зеленый");
        JCheckBox blue = new JCheckBox("Синий");

        ItemListener listener = e -> {
            if (red.isSelected()) color = Color.RED;
            if (green.isSelected()) color = Color.GREEN;
            if (blue.isSelected()) color = Color.BLUE;
            repaint();
        };

        red.addItemListener(listener);
        green.addItemListener(listener);
        blue.addItemListener(listener);

        this.add(red);
        this.add(green);
        this.add(blue);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(200, 100, 100, 100);
    }
}
