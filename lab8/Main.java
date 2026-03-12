import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {

    int mode = 0;

    Button b1 = new Button("y = kx");
    Button b2 = new Button("y = 3x^2");
    Button b3 = new Button("y = -x^2 + x^3");
    Button b4 = new Button("y = x^3 + x^2 + x");
    Button b5 = new Button("y = x^5");
    Button b6 = new Button("y = sin x");
    Button b7 = new Button("y = cos(x-1)+x");

    public Main() {

        setTitle("Построение графиков");
        setSize(800,600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        b1.setBounds(10,50,140,30);
        b2.setBounds(10,90,140,30);
        b3.setBounds(10,130,140,30);
        b4.setBounds(10,170,140,30);
        b5.setBounds(10,210,140,30);
        b6.setBounds(10,250,140,30);
        b7.setBounds(10,290,140,30);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1) mode=1;
        if(e.getSource()==b2) mode=2;
        if(e.getSource()==b3) mode=3;
        if(e.getSource()==b4) mode=4;
        if(e.getSource()==b5) mode=5;
        if(e.getSource()==b6) mode=6;
        if(e.getSource()==b7) mode=7;

        repaint();
    }

    public void paint(Graphics g) {

        super.paint(g);

        int cx = 450;
        int cy = 300;

        g.setColor(Color.LIGHT_GRAY);

        for(int i=0;i<900;i+=20){
            g.drawLine(i,0,i,600);
        }

        for(int i=0;i<600;i+=20){
            g.drawLine(0,i,900,i);
        }

        g.setColor(Color.BLACK);
        g.drawLine(cx,0,cx,600);
        g.drawLine(0,cy,900,cy);

        g.setColor(Color.RED);

        for(int x=-200;x<200;x++){

            double y = 0;

            switch(mode){

                case 1:
                    y = 0.1*x; // y = kx
                    break;

                case 2:
                    y = 3*Math.pow(x/20.0,2)*20; // y = 3x²
                    break;

                case 3:
                    y = -Math.pow(x/20.0,2)*20 + Math.pow(x/20.0,3)*20; // -x² + x³
                    break;

                case 4:
                    y = (Math.pow(x/20.0,3)+Math.pow(x/20.0,2)+x/20.0)*20; // x³+x²+x
                    break;

                case 5:
                    y = Math.pow(x/20.0,5)*2; // x⁵
                    break;

                case 6:
                    y = 80*Math.sin(Math.PI*x/180); // sin x
                    break;

                case 7:
                    y = 80*Math.cos(Math.PI*(x-1)/180)+x/2; // cos(x−1)+x
                    break;
            }

            g.drawLine(cx+x, cy-(int)y, cx+x+1, cy-(int)y);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
