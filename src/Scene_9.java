class Scene_9 extends Scene {
    private boolean bad=true;
    private MySoundEffect song1,song2;
    Scene_9(Game controller) {

        super("9", controller, 704, 302);

        background.add(rightArrowButton(8, true));

        for (int i = 0; i < 5; i++) {
            if (false == controller.getCorrect(i)) {
                bad = false;
            }
        }

    }

}
class MySoundEffect
{
    private java.applet.AudioClip audio;

    public MySoundEffect(String filename)
    {
        try
        {
            java.io.File file = new java.io.File(filename);
            audio = java.applet.Applet.newAudioClip(file.toURL());
        }
        catch (Exception e) { e.printStackTrace(); }
    }
    public void playOnce()   { audio.play(); }
    public void playLoop()   { audio.loop(); }
    public void stop()       { audio.stop(); }
}