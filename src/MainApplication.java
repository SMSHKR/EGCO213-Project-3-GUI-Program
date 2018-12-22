import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
        ImageIcon playNormalIcon = new ImageIcon("resource/play_normal.png");
        ImageIcon playFocusIcon = new ImageIcon("resource/play_focus.png");

        playButton.setBounds(100, 100, playNormalIcon.getIconWidth(), playNormalIcon.getIconHeight());
        playButton.setIcon(playNormalIcon);
        playButton.setBorderPainted(false);
        playButton.setFocusPainted(false);
        playButton.setContentAreaFilled(false);

        playButton.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) { }

            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }

            public void mouseEntered(MouseEvent e) { playButton.setIcon(playFocusIcon); }
            public void mouseExited(MouseEvent e) { playButton.setIcon(playNormalIcon); }

        });

        return playButton;
    }

}