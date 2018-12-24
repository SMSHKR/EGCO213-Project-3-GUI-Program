import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Scene_3 extends Scene {

    private ImageIcon tableIcon = new ImageIcon("resource/scene_3/table.png");
    private JLabel table = new JLabel(tableIcon);
    private int table_x = 50;
    private int table_y = 10;

    private ImageIcon [] unknownIcon = new ImageIcon [2];
    private JLabel unknown = new JLabel();
    private int unknown_x = 0;
    private int unknown_y = 0;

    private ImageIcon [] paperIcon = new ImageIcon [5];
    private JLabel [] paper = new JLabel [5];
    private int [] paper_x = new int [5];
    private int [] paper_y = new int [5];

    Scene_3(Game controller) {

        super("3", controller, 0, 0);

        table.setIcon(tableIcon);
        table.setBounds(table_x, table_y, tableIcon.getIconWidth(), tableIcon.getIconHeight());

        unknownIcon [0] = new ImageIcon("resource/scene_3/unknown_0.png");
        unknownIcon [1] = new ImageIcon("resource/scene_3/unknown_1.png");
        unknown.setIcon(unknownIcon[0]);
        unknown.setBounds(unknown_x, unknown_y, unknownIcon[0].getIconWidth(), unknownIcon[0].getIconHeight());

        unknown.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) { unknown.setIcon(unknownIcon[1]); }
            public void mouseExited(MouseEvent e) { unknown.setIcon(unknownIcon[0]); }
        });

        paper_x [0] = 100;
        paper_y [0] = 100;

        paper_x [1] = 110;
        paper_y [1] = 110;

        paper_x [2] = 120;
        paper_y [2] = 120;

        paper_x [3] = 130;
        paper_y [3] = 130;

        paper_x [4] = 140;
        paper_y [4] = 140;

        for (int i = 0; i < 5; i++) {

            paperIcon[i] = new ImageIcon("resource/scene_3/paper_" + (i + 1) + ".png");
            paper[i] = new JLabel(paperIcon[i]);
            paper[i].setBounds(paper_x[i], paper_y[i], paperIcon[i].getIconWidth(), paperIcon[i].getIconHeight());

            paper[i].addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) { changeScene(4, false); }
            });

            background.add(paper[i]);

        }

        background.add(table);
        background.add(unknown);

    }

}
