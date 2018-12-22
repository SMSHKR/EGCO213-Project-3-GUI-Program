import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Screen1 extends JFrame
{
    public Screen1()
    {
        setTitle("Location Name 1");
        setBackground(Color.gray);
        setSize(1920,1080);
        setLocation(10, 10);
        setResizable(false);
        JPanel panel  = new JPanel();
        panel.setBackground(Color.WHITE);

        UI ui = new UI();
        panel.add(ui.getBackpackImage());
        //pack();
        //remove(ui);
        panel.add(ui.getInventoryImage());
        panel.setBounds(0,50,100,50);
        //pack();
        add(panel);

        setVisible(true);

    }
    public static void main(String[] args)
    {
        new Screen1();
    }
}

