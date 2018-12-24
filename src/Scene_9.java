import javax.swing.*;

class Scene_9 extends Scene {
    private boolean bad=true;
    private JCheckBox chkBox1 = new JCheckBox("Test 1");
    private JCheckBox chkBox2 = new JCheckBox("Test 2");
    private JCheckBox chkBox3 = new JCheckBox("Test 3");
    private JCheckBox chkBox4 = new JCheckBox("Test 4");
    private JCheckBox chkBox5 = new JCheckBox("Test 5");

    Scene_9(Game controller) {


        super("9", controller, 704, 302);

        chkBox1.setBounds(100,100,100,25);
        chkBox2.setBounds(100,150,100,25);
        chkBox3.setBounds(100,200,100,25);
        chkBox4.setBounds(100,250,100,25);
        chkBox5.setBounds(100,300,100,25);

        background.add(chkBox1);
        background.add(chkBox2);
        background.add(chkBox3);
        background.add(chkBox4);
        background.add(chkBox5);

        if(controller.getCorrect(0) == true)
            chkBox1.setSelected(true);
        if(controller.getCorrect(1) == true)
            chkBox2.setSelected(true);
        if(controller.getCorrect(2) == true)
            chkBox3.setSelected(true);
        if(controller.getCorrect(3) == true)
            chkBox4.setSelected(true);
        if(controller.getCorrect(4) == true)
            chkBox5.setSelected(true);

        background.add(rightArrowButton(8, true));
        int mistake=0;
        for (int i = 0; i < 5; i++) {
            if (false == controller.getCorrect(i)) {
                bad = false;
                mistake++;
            }
        }

        if(mistake>2)
        if(mistake<3)background.add(leftArrowButton(10, true));
    }

}
