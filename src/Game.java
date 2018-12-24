import javax.swing.*;
import java.util.TimerTask;
import java.util.Timer;

public class Game {

    private JFrame [] scene = new JFrame [11];
    private ImageIcon [] WARP = new ImageIcon [4];

    private boolean [] correct = new boolean [5];

    public Game(JFrame main) {

        main.setVisible(false);

        WARP [0] = new ImageIcon("resource/rabbit/warp_0.png");
        WARP [1] = new ImageIcon("resource/rabbit/warp_1.png");
        WARP [2] = null;
        WARP [3] = new ImageIcon("resource/rabbit/idle.png");

        scene [0] = main;
        scene [1] = new Scene_1(this);
        scene [2] = new Scene_2(this);
        scene [3] = new Scene_3(this);
        scene [4] = new Scene_4(this);
        scene [5] = new Scene_5(this);
        scene [6] = new Scene_6(this);
        scene [7] = new Scene_7(this);
        scene [8] = new Scene_8(this);
        scene [9] = new Scene_9(this);
        scene[10] = new Scene_10(this);

        scene[1].setVisible(true);

    }

    void answer(int index, boolean ans) { correct [index] = ans; }

    private static boolean changing = false;
    void changeScene(JFrame caller, int target, JLabel rabbit, boolean warp) {

        if (!warp) {
            caller.setVisible(false);
            scene[target].setVisible(true);
            return;
        }

        if (changing) return;

        changing = true;

        Thread animator = new Thread(() -> {
            for (ImageIcon warpIcon : WARP) {
                rabbit.setIcon(warpIcon);
                try { Thread.sleep(500); }
                catch (InterruptedException e) { }
            }
        });
        animator.start();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                caller.setVisible(false);
                scene[target].setVisible(true);
                changing = false;
            }
        }, (WARP.length - 1) * 500);

    }

    void onClosing() { scene[0].setVisible(true); }

}
