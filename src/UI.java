import javax.swing.*;

public class UI extends JPanel {

    private ImageIcon backpack = new ImageIcon("resource/backpack.png");
    private ImageIcon inventory = new ImageIcon("resource/slot_inventory.png");

    public UI() { }

    public ImageIcon getBackpack() { return backpack; }
    public ImageIcon getInventory() { return inventory; }

}
