import javax.swing.*;
import javax.swing.JFrame;

public class MainApplication extends JFrame {

    public static void main(String[] args) { new MainApplication(); }

    public MainApplication() {

        setTitle("Placeholder");
        setBounds(50, 50, 500, 500);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        titleScreen();

    }

    private void titleScreen() {

        ImagePanel panel = new ImagePanel("resource/title.png");
        add(panel);
        pack();

        // TODO rabbit animation
        try { Thread.sleep(3000); }
        catch (InterruptedException e) { }

        remove(panel);
        panel = new ImagePanel("resource/house.png");
        add(panel);
        pack();

    }

}