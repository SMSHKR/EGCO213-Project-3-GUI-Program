import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Game{
    Timer timer;
    TimerTask task;
    private JFrame [] scene = new JFrame [10];
    private ImageIcon [] WARP = new ImageIcon [2];

    public Game(JFrame main) {

        main.setVisible(false);

        WARP [0] = new ImageIcon("resource/warp_0.png");
        WARP [1] = new ImageIcon("resource/warp_1.png");

        scene [0] = main;
        scene [1] = new Scene_1(this);
        scene [2] = new Scene_2(this);
        scene [3] = new Scene_3(this);

        scene[1].setVisible(true);

    }

    void changeScene(JFrame caller, int target, JLabel rabbit) {

        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                rabbit.setIcon(WARP[0]);
                rabbit.setIcon(WARP[1]);
                rabbit.setIcon(null);
                System.out.print("Test");

            }


        };

        caller.setVisible(false);
        scene[target].setVisible(true);


    }
    public void start()
    {
        timer.scheduleAtFixedRate(task, 500, 500);
    }

    void onClosing() { scene[0].setVisible(true); }

}
