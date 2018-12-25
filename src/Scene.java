import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Scene extends JFrame {

    private JLabel rabbit = new JLabel();

    Game controller;
    ImagePanel background;

    Scene(String name, Game controller) {

        this.controller = controller;

        setTitle("Scene " + name);
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { controller.onClosing(); }
        });
        background = new ImagePanel("resource/scene_" + name + "/scene.png");

        add(background);
        pack();

    }

    Scene(String name, Game controller, int x, int y) {

        this(name, controller);
        int nn=Integer.parseInt(name);
        if(nn==6)rabbit.setIcon(new ImageIcon("resource/rabbit/idle_4.png"));      //edit
        else rabbit.setIcon(new ImageIcon("resource/rabbit/idle.png"));           //edit
        rabbit.setBounds(x, y, rabbit.getIcon().getIconWidth(), rabbit.getIcon().getIconHeight());

        background.add(rabbit);

    }

    void changeScene(int target, boolean warp) { controller.changeScene(this, target, rabbit, warp); }

    JButton rightArrowButton(int target, boolean warp) {

        JButton arrowButton = new JButton();
        ImageIcon arrowNormalIcon = new ImageIcon("resource/arrow_r_normal.png");
        ImageIcon arrowFocusIcon = new ImageIcon("resource/arrow_r_focus.png");

        arrowButton.setBounds(getWidth() - 250, getHeight() - 220, arrowNormalIcon.getIconWidth(), arrowNormalIcon.getIconHeight());
        arrowButton.setIcon(arrowNormalIcon);
        arrowButton.setBorderPainted(false);
        arrowButton.setFocusPainted(false);
        arrowButton.setContentAreaFilled(false);

        arrowButton.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) { changeScene(target, warp); }

            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }

            public void mouseEntered(MouseEvent e) { arrowButton.setIcon(arrowFocusIcon); arrowButton.setSize(arrowFocusIcon.getIconWidth(), arrowFocusIcon.getIconHeight()); }
            public void mouseExited(MouseEvent e) { arrowButton.setIcon(arrowNormalIcon); arrowButton.setSize(arrowNormalIcon.getIconWidth(), arrowNormalIcon.getIconHeight()); }

        });

        return arrowButton;

    }

    JButton leftArrowButton(int target, boolean warp) {

        JButton arrowButton = new JButton();
        ImageIcon arrowNormalIcon = new ImageIcon("resource/arrow_l_normal.png");
        ImageIcon arrowFocusIcon = new ImageIcon("resource/arrow_l_focus.png");

        arrowButton.setBounds(50, getHeight() - 220, arrowNormalIcon.getIconWidth(), arrowNormalIcon.getIconHeight());
        arrowButton.setIcon(arrowNormalIcon);
        arrowButton.setBorderPainted(false);
        arrowButton.setFocusPainted(false);
        arrowButton.setContentAreaFilled(false);

        arrowButton.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) { changeScene(target, warp); }

            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }

            public void mouseEntered(MouseEvent e) { arrowButton.setIcon(arrowFocusIcon); arrowButton.setSize(arrowFocusIcon.getIconWidth(), arrowFocusIcon.getIconHeight()); }
            public void mouseExited(MouseEvent e) { arrowButton.setIcon(arrowNormalIcon); arrowButton.setSize(arrowNormalIcon.getIconWidth(), arrowNormalIcon.getIconHeight()); }

        });

        return arrowButton;

    }

}
