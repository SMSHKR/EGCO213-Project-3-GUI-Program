import javax.swing.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Game {

    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    private JFrame [] scene = new JFrame [10];
    private ImageIcon [] WARP = new ImageIcon [3];

    public Game(JFrame main) {

        main.setVisible(false);

        WARP [0] = new ImageIcon("resource/warp_0.png");
        WARP [1] = new ImageIcon("resource/warp_1.png");
        WARP [2] = null;

        scene [0] = main;
        scene [1] = new Scene_1(this);
        scene [2] = new Scene_2(this);
        scene [3] = new Scene_3(this);

        scene[1].setVisible(true);

    }

    void changeScene(JFrame caller, int target, JLabel rabbit) {

        Thread animator = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                rabbit.setIcon(WARP[i]);
                try { Thread.sleep(500); }
                catch (InterruptedException e) { }
            }
        });
        animator.start();

        scheduler.schedule(() -> {
            caller.setVisible(false);
            scene[target].setVisible(true);
        }, 2000, TimeUnit.MILLISECONDS);

    }

    void onClosing() { scene[0].setVisible(true); }

}
