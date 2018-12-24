import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Scene_4 extends Scene {

    private ImageIcon[] paperIcon = new ImageIcon [5];
    private JLabel [] paper = new JLabel [5];
    private int [] paper_x = new int [5];
    private int [] paper_y = new int [5];

    private String [] question = new String [5];
    private String [] answer = new String [5];

    Scene_4(Game controller) {

        super("4", controller);

        question [0] = "Find the variable x from 5x - 15 = 100";
        question [1] = "Find geometric sequences 5, 25, 125, 625, x";
        question [2] = "3 + 3 x 3 - 3 = ?";
        question [3] = "Find the variable x from 6x - 60 = 360";
        question [4] = "6 + 2 x 8 - 5 x 3 + 8 = ?";

        double temp;

        temp = (100 + 15) / 5.0;
        answer [0] = String.valueOf((int) temp);

        temp = Math.pow(5, 5);
        answer [1] = String.valueOf((int) temp);

        temp = 3 + 3 * 3 - 3;
        answer [2] = String.valueOf((int) temp);

        temp = (360 + 60) / 6.0;
        answer [3] = String.valueOf((int) temp);

        temp = 6 + 2 * 8 - 5 * 3 + 8;
        answer [4] = String.valueOf((int) temp);

        paper_x [0] = 630;
        paper_y [0] = 530;

        paper_x [1] = 500;
        paper_y [1] = 530;

        paper_x [2] = 500;
        paper_y [2] = 600;

        paper_x [3] = 630;
        paper_y [3] = 600;

        paper_x [4] = 570;
        paper_y [4] = 660;

        for (int i = 0; i < 5; i++) {

            paperIcon[i] = new ImageIcon("resource/scene_4/paper_" + (i + 1) + ".png");
            paper[i] = new JLabel(paperIcon[i]);
            paper[i].setBounds(paper_x[i], paper_y[i], paperIcon[i].getIconWidth(), paperIcon[i].getIconHeight());

            int index = i;
            paper[i].addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    String input = JOptionPane.showInputDialog(question[index]);
                    if (input != null) controller.answer(index, input.equals(answer[index]));
                }
            });

            background.add(paper[i]);

        }

        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == 'e') changeScene(3, false);
            }
        });

    }

}
