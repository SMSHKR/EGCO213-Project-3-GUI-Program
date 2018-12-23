import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Scene_3 extends JFrame {

    public Scene_3(Game controller) {

        setTitle("Scene 3");
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { controller.onClosing(); }
        });

        ImagePanel background = new ImagePanel("resource/scene_3.png");
        add(background);
        pack();

    }

}
