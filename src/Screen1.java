import javax.swing.*;
import java.awt.*;

public class Screen1 extends JFrame {

    public Screen1() {

        JButton BackpackButton = new JButton();
        JPanel panel = new JPanel();
        setTitle("Location Name 1");
        setBackground(Color.gray);
        setLocation(10, 10);
        setResizable(false);
        UI ui = new UI();
        BackpackButton.setIcon(ui.getBackpack());
        BackpackButton.setBounds(200, 200, 50, 50);
        setBounds(0, 500, 100, 50);
        panel.add(BackpackButton);
        panel.setBounds(800, 200, 50, 50);
        add(panel);
        setSize(1920, 1080);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Screen1();
    }

}

