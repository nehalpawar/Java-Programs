
import java.awt.*;

class SimpleFrame1 extends Frame {

    public SimpleFrame1() {
        setTitle("Simple Frame 1");
        setSize(400, 300);
        setVisible(true);
        setBackground(Color.BLUE);
        setForeground(Color.BLACK);
    }

    public static void main(String args[]) {
        SimpleFrame1 obj = new SimpleFrame1();
    }
}