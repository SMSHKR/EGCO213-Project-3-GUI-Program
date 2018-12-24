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

        background.add(table);
        background.add(unknown);

    }

}
