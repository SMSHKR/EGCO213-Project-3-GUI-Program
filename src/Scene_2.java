import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Scene_2 extends JFrame {

    public Scene_2(Game controller) {

        setTitle("Scene 2");
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { controller.onClosing(); }
        });

        ImagePanel background = new ImagePanel("resource/scene_2.png");
        add(background);
        pack();

    }

}
