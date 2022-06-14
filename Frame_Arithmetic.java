// Frame Arithmetic Operations:

import java.awt.*;
import java.awt.event.*;

import javax.swing.text.LabelView;

class Frame_Arithmetic extends Frame implements ActionListener {
    Label l1, l2, l3;
    Button b1, b2, b3, b4, b5;
    TextField t1, t2, t3;

    Frame_Arithmetic() {
        setTitle("Frame_Arithmetic");
        setSize(300, 200);
        setVisible(true);
        setLayout(new GridLayout(6, 2));

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        l1 = new Label("Num1 :", Label.LEFT);
        l2 = new Label("Num2 :", Label.LEFT);
        l1 = new Label("Answer :", Label.LEFT);

        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);

        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mul");
        b4 = new Button("Div");
        b5 = new Button("Reset");

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(b1);
        add(b2);

        add(b3);
        add(b4);

        add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        int n1 = Integer.valueOf(t1.getText());
        int n2 = Integer.valueOf(t2.getText());

        String add = String.valueOf(n1 + n2);
        String sub = String.valueOf(n1 - n2);
        String mul = String.valueOf(n1 * n2);
        String div = String.valueOf(n1 / n2);

        if (event.getSource() == b1) {
            t3.setText(add);
        }

        if (event.getSource() == b2) {
            t3.setText(sub);
        }

        if (event.getSource() == b3) {
            t3.setText(mul);
        }

        if (event.getSource() == b4) {
            t3.setText(div);
        }

        if (event.getSource() == b5) {
            t1.setText("");
            t2.setText("");
            t3.setText("");

        }

    }

    public static void main(String args[]) {
        new Frame_Arithmetic();
    }

}