import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    // Переменные, доступные для всего класса
    static int x = 0, y = 0;
    static Color color = Color.BLACK;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Лабораторная работа");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabs = new JTabbedPane();

        // 1. Фигуры
        tabs.add("Фигуры", new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawRect(50, 50, 150, 100);
                g.drawString("Прямоугольник", 50, 40);

                g.drawOval(250, 50, 100, 100);
                g.drawString("Круг", 250, 40);

                g.drawLine(50, 200, 200, 200);
                g.drawString("Линия", 50, 190);
            }
        });

        // 2. Кнопка
        JPanel p2 = new JPanel();
        JLabel label2 = new JLabel("");
        JButton btn2 = new JButton("Нажми");
        btn2.addActionListener(e -> label2.setText("Hello Java"));
        p2.add(btn2);
        p2.add(label2);
        tabs.add("Кнопка", p2);

        // 3. TextField
        JPanel p3 = new JPanel();
        JTextField tf = new JTextField(10);
        JButton btn3 = new JButton("OK");
        JLabel label3 = new JLabel("");
        btn3.addActionListener(e -> label3.setText("Привет, " + tf.getText()));
        p3.add(tf);
        p3.add(btn3);
        p3.add(label3);
        tabs.add("Имя", p3);

        // 4. Цвет
        JPanel p4 = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(color);
                g.fillOval(200, 100, 100, 100);
            }
        };
        JButton btn4 = new JButton("Сменить цвет");
        btn4.addActionListener(e -> {
            if (color == Color.RED) color = Color.GREEN;
            else if (color == Color.GREEN) color = Color.BLUE;
            else color = Color.RED;
            p4.repaint();
        });
        p4.add(btn4);
        tabs.add("Цвет", p4);

        // 5. Координаты
        JPanel p5 = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.fillOval(x, y, 50, 50);
            }
        };
        JTextField xField = new JTextField(3);
        JTextField yField = new JTextField(3);
        JButton drawBtn = new JButton("Draw");
        drawBtn.addActionListener(e -> {
            try {
                x = Integer.parseInt(xField.getText());
                y = Integer.parseInt(yField.getText());
                p5.repaint();
            } catch (Exception ignored) {}
        });
        p5.add(new JLabel("X:"));
        p5.add(xField);
        p5.add(new JLabel("Y:"));
        p5.add(yField);
        p5.add(drawBtn);
        tabs.add("Координаты", p5);

        // 6. Мышь
        JPanel p6 = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.fillOval(x, y, 5, 5);
                g.drawString("X: " + x + " Y: " + y, 10, 20);
            }
        };
        p6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                p6.repaint();
            }
        });
        tabs.add("Мышь", p6);

        // 7. Клавиатура
        JPanel p7 = new JPanel();
        JLabel keyLabel = new JLabel("Нажмите клавишу");
        p7.add(keyLabel);
        p7.setFocusable(true);
        p7.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                keyLabel.setText("Нажато: " + e.getKeyChar());
            }
        });
        tabs.add("Клавиатура", p7);

        // 8. Калькулятор
        JPanel p8 = new JPanel();
        JTextField t1 = new JTextField(5);
        JTextField t2 = new JTextField(5);
        JButton addBtn = new JButton("+");
        JLabel result = new JLabel("0");
        addBtn.addActionListener(e -> {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                result.setText(String.valueOf(a + b));
            } catch (Exception ignored) {}
        });
        p8.add(t1);
        p8.add(t2);
        p8.add(addBtn);
        p8.add(result);
        tabs.add("Калькулятор", p8);

        // 9. Анимация
        JPanel p9 = new JPanel() {
            int x = 0;

            {
                Timer timer = new Timer(50, e -> {
                    x += 5;
                    if (x > getWidth()) x = 0;
                    repaint();
                });
                timer.start();
            }

            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.fillOval(x, 100, 50, 50);
            }
        };
        tabs.add("Анимация", p9);

        // 10. Checkbox
        JPanel p10 = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(color);
                g.fillRect(200, 100, 100, 100);
            }
        };
        JCheckBox red = new JCheckBox("Красный");
        JCheckBox green = new JCheckBox("Зеленый");
        JCheckBox blue = new JCheckBox("Синий");

        ItemListener listener = e -> {
            if (red.isSelected()) color = Color.RED;
            if (green.isSelected()) color = Color.GREEN;
            if (blue.isSelected()) color = Color.BLUE;
            p10.repaint();
        };

        red.addItemListener(listener);
        green.addItemListener(listener);
        blue.addItemListener(listener);

        p10.add(red);
        p10.add(green);
        p10.add(blue);
        tabs.add("Checkbox", p10);

        frame.add(tabs);
        frame.setVisible(true);
    }
}
