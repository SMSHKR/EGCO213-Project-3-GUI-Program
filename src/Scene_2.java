import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

class Scene_2 extends Scene {

    private ImageIcon tableIcon = new ImageIcon("resource/table_pokeball.png");
    private JLabel table = new JLabel(tableIcon);
    private int table_x = 10;
    private int table_y = 10;

    private ImageIcon [] sinkIcon = new ImageIcon [2];
    private JLabel sink = new JLabel();
    private int sink_x = -50;
    private int sink_y = -10;

    private ImageIcon [] fridgeIcon = new ImageIcon [3];
    private JLabel fridge = new JLabel();
    private int fridge_x = -50;
    private int fridge_y = 0;

    Scene_2(Game controller) {

        super("2", controller, 0, 0);

        table.setIcon(tableIcon);
        table.setBounds(table_x, table_y, tableIcon.getIconWidth(), tableIcon.getIconHeight());

        sinkIcon [0] = new ImageIcon("resource/sink_0.png");
        sinkIcon [1] = new ImageIcon("resource/sink_1.png");
        sink.setIcon(sinkIcon[0]);
        sink.setBounds(sink_x, sink_y, sinkIcon[0].getIconWidth(), sinkIcon[0].getIconHeight());

        sink.addMouseListener(new MouseAdapter() {
            private boolean finished = true;
            public void mouseClicked(MouseEvent e) {
                if (!finished) { return; }
                finished = false;
                sink.setIcon(sinkIcon[1]);
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    public void run() {
                        sink.setIcon(sinkIcon[0]);
                        finished = true;
                    }
                }, 2000);
            }
        });

        fridgeIcon [0] = new ImageIcon("resource/fridge_0.png");
        fridgeIcon [1] = new ImageIcon("resource/fridge_1.png");
        fridgeIcon [2] = new ImageIcon("resource/fridge_2.png");
        fridge.setIcon(fridgeIcon[0]);
        fridge.setBounds(fridge_x, fridge_y, fridgeIcon[0].getIconWidth(), fridgeIcon[0].getIconHeight());

        background.add(table);
        background.add(sink);
        background.add(fridge);

    }

}
