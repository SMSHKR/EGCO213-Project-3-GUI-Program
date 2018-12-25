import javax.swing.*;

class Scene_9 extends Scene {

    private boolean bad = true;
    private int mistake = 0;

    private JCheckBox [] chkBox = new JCheckBox [5];

    Scene_9(Game controller) {

        super("9", controller, 704, 302);

        background.add(rightArrowButton(8, true));

        for (int i = 0; i < 5; i++) {

            chkBox [i] = new JCheckBox("Test " + (i + 1));
            chkBox[i].setBounds(100,100 + i * 50,100,25);

            chkBox[i].setEnabled(false);
            background.add(chkBox[i]);

        }

        background.add(leftArrowButton(10, true));

    }

    void updateCheckBox() {

        bad = true;

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (controller.getCorrect(i)) chkBox[i].setSelected(true);
            else {
                chkBox[i].setSelected(false);
                bad = false;
                count++;
            }
        }

        mistake = count;

    }

}
