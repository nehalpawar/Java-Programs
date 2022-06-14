// Simple Frame 2

import java.awt.*;
import java.awt.event.*;

public class SimpleFrame2 extends Frame {
    Label l;

    SimpleFrame2() {
        l = new Label("Simple Frame2 with window closing event");

        add(l);

        setTitle("Simple Frame 2");
        setSize(250, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            };
        });
    }

    public static void main(String[] args) {
        new SimpleFrame2();
    }
}