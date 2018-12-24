class Scene_9 extends Scene {
private boolean bad=true;
    Scene_9(Game controller) {

        super("9", controller, 704, 302);

        background.add(rightArrowButton(8, true));

for(int i=0;i<5;i++){
    if(false==controller.getCorrect(i)){
       bad=false;
    }

}

    }

}
