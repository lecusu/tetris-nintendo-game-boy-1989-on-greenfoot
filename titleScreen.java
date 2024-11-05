import greenfoot.*;
public class titleScreen extends World {
    public titleScreen() {
        super(25, 22, 35, false);
        GreenfootImage bg = new GreenfootImage("title_screen.png");
        bg.scale(25 * 35, 22 * 35);
        setBackground(bg);
        if(playground.music.isPlaying()){
            playground.music.stop();
        }
        
    }
    public void act() {
        if(Greenfoot.isKeyDown("Enter")){
            Greenfoot.setWorld(new playground());
        }
    }
}
