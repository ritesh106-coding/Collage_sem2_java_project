import javax.swing.*;

public class BasicGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("Basic GUI");

        JLabel l = new JLabel("Welcome to Java");
        JLabel l2 = new JLabel("This is basic GUI program and Test1");
        l.setBounds(80, 80, 200, 30);
        l2.setBounds(80, 120, 200, 30);

        f.add(l);
        f.add(l2);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}