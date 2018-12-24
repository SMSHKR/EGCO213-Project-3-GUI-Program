import javax.swing.*;

class Scene_6 extends Scene {
    private ImageIcon busicon= new ImageIcon("/resource/bus.png");
    private JLabel bus = new JLabel(busicon);
    private int bus_x = 646;
    private int bus_y = 357;

    Scene_6(Game controller) {

        super("6", controller, 553, 295);

        background.add(rightArrowButton(5, true));
        background.add(leftArrowButton(7, true));
        bus.setIcon(busicon);
        bus.setBounds(bus_x, bus_y, busicon.getIconWidth(), busicon.getIconHeight());
        background.add(bus);
    }

}
