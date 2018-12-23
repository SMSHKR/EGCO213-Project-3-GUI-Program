import javax.swing.*;

public class Game {

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

        rabbit.setIcon(WARP[0]);
        try { Thread.sleep(500); }
        catch (InterruptedException e) { }

        rabbit.setIcon(WARP[1]);
        try { Thread.sleep(500); }
        catch (InterruptedException e) { }

        rabbit.setIcon(null);
        try { Thread.sleep(500); }
        catch (InterruptedException e) { }

        caller.setVisible(false);
        scene[target].setVisible(true);

    }

    void onClosing() { scene[0].setVisible(true); }

}
