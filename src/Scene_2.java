import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

class Scene_2 extends Scene {

    private ImageIcon tableIcon = new ImageIcon("resource/scene_2/table_pokeball.png");
    private JLabel table = new JLabel(tableIcon);
    private int table_x = 50;
    private int table_y = -110;

    private ImageIcon [] sinkIcon = new ImageIcon [2];
    private JLabel sink = new JLabel();
    private int sink_x = 250;
    private int sink_y = 170;

    private ImageIcon [] fridgeIcon = new ImageIcon [3];
    private JLabel fridge = new JLabel();
    private int fridge_x = 0;
    private int fridge_y = 350;

    Scene_2(Game controller) {

        super("2", controller, 830, 343);

        background.add(leftArrowButton(3, true));
        background.add(rightArrowButton(1, true));

        table.setIcon(tableIcon);
        table.setBounds(table_x, table_y, tableIcon.getIconWidth(), tableIcon.getIconHeight());

        sinkIcon [0] = new ImageIcon("resource/scene_2/sink_0.png");
        sinkIcon [1] = new ImageIcon("resource/scene_2/sink_1.png");
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

        fridgeIcon [0] = new ImageIcon("resource/scene_2/fridge_0.png");
        fridgeIcon [1] = new ImageIcon("resource/scene_2/fridge_1.png");
        fridgeIcon [2] = new ImageIcon("resource/scene_2/fridge_2.png");
        fridge.setIcon(fridgeIcon[0]);
        fridge.setBounds(fridge_x, fridge_y, fridgeIcon[0].getIconWidth(), fridgeIcon[0].getIconHeight());

        fridge.addMouseListener(new MouseAdapter() {
            private boolean opened = false;
            public void mouseClicked(MouseEvent e) { fridge.setIcon(fridgeIcon[2]); opened = true; }
            public void mouseExited(MouseEvent e) {
                if (!opened) return;
                fridge.setIcon(fridgeIcon[1]);
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    public void run() { fridge.setIcon(fridgeIcon[0]); opened = false; }
                }, 300);
            }
        });

        background.add(table);
        background.add(sink);
        background.add(fridge);

    }

}
