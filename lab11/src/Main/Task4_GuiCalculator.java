import javax.swing.*;
import java.awt.*;
import javax.script.*;

public class GuiCalculator {
    public static void run() {
        JFrame f = new JFrame("Calculator");
        JTextField t = new JTextField();
        JButton b = new JButton("=");

        f.add(t, BorderLayout.NORTH);
        f.add(b, BorderLayout.SOUTH);

        b.addActionListener(e -> {
            try {
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
                t.setText(engine.eval(t.getText()).toString());
            } catch (Exception ex) {
                t.setText("Error");
            }
        });

        f.setSize(300,150);
        f.setVisible(true);
    }
}
