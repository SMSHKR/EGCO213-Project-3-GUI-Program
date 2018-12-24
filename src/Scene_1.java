import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Scene_1 extends Scene {

    Scene_1(Game controller) {

        super("1", controller, 200, 500);
        background.add(arrowButton());

    }

    private JButton arrowButton() {

        JButton arrowButton = new JButton();
        ImageIcon arrowNormalIcon = new ImageIcon("resource/arrow_r_normal.png");
        ImageIcon arrowFocusIcon = new ImageIcon("resource/arrow_r_focus.png");

        arrowButton.setBounds(getWidth() - 300, getHeight() - 250, arrowNormalIcon.getIconWidth(), arrowNormalIcon.getIconHeight());
        arrowButton.setIcon(arrowNormalIcon);
        arrowButton.setBorderPainted(false);
        arrowButton.setFocusPainted(false);
        arrowButton.setContentAreaFilled(false);

        arrowButton.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) { changeScene(2); }

            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }

            public void mouseEntered(MouseEvent e) { arrowButton.setIcon(arrowFocusIcon); arrowButton.setSize(arrowFocusIcon.getIconWidth(), arrowFocusIcon.getIconHeight()); }
            public void mouseExited(MouseEvent e) { arrowButton.setIcon(arrowNormalIcon); arrowButton.setSize(arrowNormalIcon.getIconWidth(), arrowNormalIcon.getIconHeight()); }

        });

        return arrowButton;

    }

}

