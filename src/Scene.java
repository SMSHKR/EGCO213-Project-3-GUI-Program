import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Scene extends JFrame {

    private Game controller;
    private JLabel rabbit = new JLabel();

    ImagePanel background;

    Scene(String name, Game controller, int x, int y) {

        this.controller = controller;

        setTitle("Scene " + name);
        setResizable(false);

        rabbit.setIcon(new ImageIcon("resource/rabbit/idle.png"));
        rabbit.setBounds(x, y, rabbit.getIcon().getIconWidth(), rabbit.getIcon().getIconHeight());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { controller.onClosing(); }
        });
        background = new ImagePanel("resource/scene_" + name + "/scene.png");

        background.add(rabbit);

        add(background);
        pack();

    }

    void changeScene(int target, boolean warp) { controller.changeScene(this, target, rabbit, warp); }

}
