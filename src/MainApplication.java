import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainApplication extends JFrame {

    public static void main(String[] args) { new MainApplication(); }

    public MainApplication() {

        setTitle("Turn Around Rabbit");
        setLocation(10, 10);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainScreen();

    }

    private void startGame() { new Game(this); }

    private void mainScreen() {

        ImagePanel panel = new ImagePanel("resource/title_text.png");
        ImageIcon [] icons = new ImageIcon[8];
        for (int i = 0; i < 8; i++)
            icons[i] = new ImageIcon("resource/rabbit/idle_" + i + ".png");
        JLabel rabbit = new JLabel();

        // TODO Change rabbit size, location here
        rabbit.setBounds(getWidth()+450, getHeight()+600, icons[0].getIconWidth(), icons[0].getIconHeight());

        panel.add(rabbit);
        add(panel);
        pack();

        for (ImageIcon icon : icons)
            try {
                rabbit.setIcon(icon);
                Thread.sleep(300);
            }
            catch (InterruptedException e) { }

        remove(panel);
        panel = new ImagePanel("resource/title_house.png");
        panel.add(playButton());
        panel.add(quitButton());
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

            public void mouseClicked(MouseEvent e) { startGame(); }

            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }

            public void mouseEntered(MouseEvent e) { playButton.setIcon(playFocusIcon); }
            public void mouseExited(MouseEvent e) { playButton.setIcon(playNormalIcon); }

        });

        return playButton;

    }

    private JButton quitButton() {

        JButton quitButton = new JButton();
        ImageIcon quitNormalIcon = new ImageIcon("resource/quit_normal.png");
        ImageIcon quitFocusIcon = new ImageIcon("resource/quit_focus.png");

        quitButton.setBounds(100, 200, quitNormalIcon.getIconWidth(), quitNormalIcon.getIconHeight());
        quitButton.setIcon(quitNormalIcon);
        quitButton.setBorderPainted(false);
        quitButton.setFocusPainted(false);
        quitButton.setContentAreaFilled(false);

        quitButton.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) { System.exit(0); }

            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }

            public void mouseEntered(MouseEvent e) { quitButton.setIcon(quitFocusIcon); }
            public void mouseExited(MouseEvent e) { quitButton.setIcon(quitNormalIcon); }

        });

        return quitButton;

    }

}