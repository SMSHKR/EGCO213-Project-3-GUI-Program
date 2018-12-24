class Scene_9 extends Scene {
    private boolean bad=true;


    Scene_9(Game controller) {

        super("9", controller, 704, 302);

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
