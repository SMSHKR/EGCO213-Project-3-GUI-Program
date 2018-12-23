import javax.swing.*;

class Game {

    JFrame main;
    JFrame scene_1;

    public Game(JFrame main) {

        main.setVisible(false);

        this.main = main;
        scene_1 = new Scene_1(this);

        scene_1.setVisible(true);

    }

    public void onClosing() { main.setVisible(true); }

}
