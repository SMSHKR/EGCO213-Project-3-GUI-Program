import javax.swing.*;

class Game {

    JFrame main;
    JFrame scene_1;
    JFrame scene_2;

    public Game(JFrame main) {

        main.setVisible(false);

        this.main = main;
        scene_1 = new Scene_1(this);
        scene_2 = new Scene_2(this);

        scene_1.setVisible(true);

    }

    public void onClosing() { main.setVisible(true); }

}
