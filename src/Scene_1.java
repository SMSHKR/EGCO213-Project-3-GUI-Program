import javax.swing.*;
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

    }

}

