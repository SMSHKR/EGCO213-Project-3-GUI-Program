import javax.swing.*;

public class UI extends JPanel
{
    private ImagePanel backpack,inventory;
    public UI()
    {
        backpack = new ImagePanel("resource/backpack.png");
        backpack.setSize(50,50);
        inventory = new ImagePanel("resource/slot_inventory.png");
        inventory.setSize(50,50);
    }
    ImagePanel getBackpackImage()
    {
        return backpack;
    }
    ImagePanel getInventoryImage() {
        return inventory;
    }
}
