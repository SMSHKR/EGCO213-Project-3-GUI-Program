import javax.swing.*;
import javax.swing.JFrame;

public class MainApplication extends JFrame {

    public static void main(String[] args) { new MainApplication(); }

    public MainApplication() {

        setTitle("Placeholder");
        setLocation(10, 10);
        setResizable(false);
        setVisible(true);
        //setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        titleScreen();

    }

    private void titleScreen() {

        ImagePanel panel = new ImagePanel("resource/title_text.png");
        add(panel);
        pack();

        // TODO rabbit animation
        try { Thread.sleep(1000); }
        catch (InterruptedException e) { }

        remove(panel);
        panel = new ImagePanel("resource/title_house.png");
        panel.add(playButton());
        add(panel);
        pack();

    }

    private JButton playButton() {

        JButton playButton = new JButton();
        ImageIcon playIcon = new ImageIcon("resource/play_normal.png");

        playButton.setBounds(100, 100, playIcon.getIconWidth(), playIcon.getIconHeight());
        playButton.setIcon(playIcon);
        playButton.setBorderPainted(false);
        playButton.setFocusPainted(false);
        playButton.setContentAreaFilled(false);

        return playButton;
    }

}