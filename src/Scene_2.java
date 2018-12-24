import javax.swing.*;

class Scene_2 extends Scene {

    private ImageIcon tableIcon = new ImageIcon("resource/table_pokeball.png");
    private JLabel table = new JLabel(tableIcon);
    private int table_x = 10;
    private int table_y = 10;

    private ImageIcon [] sinkIcon = new ImageIcon [2];
    private JLabel sink = new JLabel();
    private int sink_x = -50;
    private int sink_y = -10;

    Scene_2(Game controller) {

        super("2", controller, 0, 0);

        table.setIcon(tableIcon);
        table.setBounds(table_x, table_y, tableIcon.getIconWidth(), tableIcon.getIconHeight());

        sinkIcon[0] = new ImageIcon("resource/sink_0.png");
        sinkIcon[1] = new ImageIcon("resource/sink_1.png");
        sink.setIcon(sinkIcon[0]);
        sink.setBounds(sink_x, sink_y, sinkIcon[0].getIconWidth(), sinkIcon[0].getIconHeight());

        background.add(table);
        background.add(sink);

    }

}
