import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Scene_3 extends Scene {

    private ImageIcon tableIcon = new ImageIcon("resource/scene_3/table.png");
    private JLabel table = new JLabel(tableIcon);
    private int table_x = 350;
    private int table_y = 300;

    private boolean bounced = false;
    private ImageIcon bookIcon = new ImageIcon("resource/scene_3/dustybook.png");
    private JLabel book = new JLabel(bookIcon);
    private int book_x = 930;
    private int book_y = 350;


    private ImageIcon [] unknownIcon = new ImageIcon [2];
    private JLabel unknown = new JLabel();
    private int unknown_x = 850;
    private int unknown_y = 300;

    private ImageIcon [] paperIcon = new ImageIcon [5];
    private JLabel [] paper = new JLabel [5];
    private int [] paper_x = new int [5];
    private int [] paper_y = new int [5];

    Scene_3(Game controller) {

        super("3", controller, 160, 450);

        background.add(leftArrowButton(5, true));
        background.add(rightArrowButton(2, true));

        table.setBounds(table_x, table_y, tableIcon.getIconWidth(), tableIcon.getIconHeight());

        book.setBounds(book_x, book_y, bookIcon.getIconWidth(), bookIcon.getIconHeight());
        book.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) { background.remove(book); }
        });
        book.setVisible(false);
        background.add(book);

        unknownIcon [0] = new ImageIcon("resource/scene_3/unknown_0.png");
        unknownIcon [1] = new ImageIcon("resource/scene_3/unknown_1.png");
        unknown.setIcon(unknownIcon[0]);
        unknown.setBounds(unknown_x, unknown_y, unknownIcon[0].getIconWidth(), unknownIcon[0].getIconHeight());

        unknown.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                unknown.setIcon(unknownIcon[1]);
                if (!bounced) {
                    book.setVisible(true);
                    bounced = true;
                }
            }
            public void mouseExited(MouseEvent e) { unknown.setIcon(unknownIcon[0]); }
        });

        paper_x [0] = 730;
        paper_y [0] = 330;

        paper_x [1] = 600;
        paper_y [1] = 330;

        paper_x [2] = 600;
        paper_y [2] = 400;

        paper_x [3] = 730;
        paper_y [3] = 400;

        paper_x [4] = 670;
        paper_y [4] = 460;

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
