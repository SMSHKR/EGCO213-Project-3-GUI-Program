import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Scene_1 extends JFrame {

    // TODO rabbit position
    private int rabbit_x = 0;
    private int rabbit_y = 0;

    public Scene_1(Game controller) {

        setTitle("Scene 1");
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { controller.onClosing(); }
        });

        ImagePanel background = new ImagePanel("resource/scene_1.jpg");
        JLabel rabbit = new JLabel();
        rabbit.setIcon(new ImageIcon("resource/idle0.png"));
        rabbit.setBounds(rabbit_x, rabbit_y, rabbit.getIcon().getIconWidth(), rabbit.getIcon().getIconHeight());
        background.add(rabbit);
        add(background);
        pack();

        background.add(arrowButton());
        validate();

    }

    private JButton arrowButton() {

        JButton arrowButton = new JButton();
        ImageIcon arrowNormalIcon = new ImageIcon("resource/arrow1.png");
        ImageIcon arrowFocusIcon = new ImageIcon("resource/arrow2.png");

        arrowButton.setBounds(getWidth() - 300, getHeight() - 250, arrowNormalIcon.getIconWidth(), arrowNormalIcon.getIconHeight());
        arrowButton.setIcon(arrowNormalIcon);
        arrowButton.setBorderPainted(false);
        arrowButton.setFocusPainted(false);
        arrowButton.setContentAreaFilled(false);

        arrowButton.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {  }

            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }

            public void mouseEntered(MouseEvent e) { arrowButton.setIcon(arrowFocusIcon); arrowButton.setSize(arrowFocusIcon.getIconWidth(), arrowFocusIcon.getIconHeight()); }
            public void mouseExited(MouseEvent e) { arrowButton.setIcon(arrowNormalIcon); arrowButton.setSize(arrowNormalIcon.getIconWidth(), arrowNormalIcon.getIconHeight()); }

        });

        return arrowButton;

    }

}

