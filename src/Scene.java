import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Scene extends JFrame {

    private Game controller;
    private JLabel rabbit = new JLabel();

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

        rabbit.setIcon(new ImageIcon("resource/rabbit/idle.png"));
        rabbit.setBounds(x, y, rabbit.getIcon().getIconWidth(), rabbit.getIcon().getIconHeight());

        background.add(rabbit);

    }

    void changeScene(int target, boolean warp) { controller.changeScene(this, target, rabbit, warp); }

}
