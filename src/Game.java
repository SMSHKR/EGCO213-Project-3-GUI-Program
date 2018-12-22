import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Game extends JFrame {

    public Game(JFrame main) {

        setTitle("Placeholder");
        setLocation(10, 10);
        setResizable(false);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                main.setVisible(true);
            }
        });

    }

}
