import javax.swing.*;

public class Scene_1 extends JFrame {

    // TODO rabbit position
    private int rabbit_x = 0;
    private int rabbit_y = 0;

    public Scene_1() {

        setTitle("Scene 1");
        setResizable(false);
        setVisible(true);

        ImagePanel background = new ImagePanel("resource/scene_1.jpg");
        JLabel rabbit = new JLabel();
        rabbit.setIcon(new ImageIcon("resource/idle0.png"));
        rabbit.setBounds(rabbit_x, rabbit_y, rabbit.getIcon().getIconWidth(), rabbit.getIcon().getIconHeight());
        background.add(rabbit);
        add(background);
        pack();

    }

    public static void main(String[] args) {
        new Scene_1();
    }

}

