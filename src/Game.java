import javax.swing.*;

class Game {

    JFrame [] scene = new JFrame [10];

    Game(JFrame main) {

        main.setVisible(false);

        scene [0] = main;
        scene [1] = new Scene_1(this);
        scene [2] = new Scene_2(this);
        scene [3] = new Scene_3(this);

        scene[1].setVisible(true);

    }

    void onClosing() { scene[0].setVisible(true); }

}
