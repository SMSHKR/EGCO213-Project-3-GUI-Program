import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Scene_7 extends Scene {
    private JRadioButton radioButton1 = new JRadioButton("1");
    private JRadioButton radioButton2 = new JRadioButton("55");
    private JRadioButton radioButton3 = new JRadioButton("82");
    private JButton startButton = new JButton("Start");
    private ButtonGroup group = new ButtonGroup();

    Scene_7(Game controller) {
        super("7", controller, 0, 0);
        background.add(startButton);
        background.add(radioButton1);
        background.add(radioButton2);
        background.add(radioButton3);

        radioButton1.setBounds(20,20,60,60);
        radioButton2.setBounds(20,30,60,60);
        radioButton3.setBounds(20,40,60, 60);

        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        startButton.setBounds(20,60,20,20);

        background.add(rightArrowButton(6, true));
        background.add(leftArrowButton(8, true));



    }

}
