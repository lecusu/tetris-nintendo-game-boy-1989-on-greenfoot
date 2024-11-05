import greenfoot.*;

public class gameover extends World {
    
    public gameover(int score) {    
        super(25, 22, 35, false);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        GreenfootImage bg = new GreenfootImage("gameover.jpg");
        bg.scale(25 * 35, 22 * 35);
        setBackground(bg);
        addObject(new Text("YOUR SCORE WAS: " + score + "!", Color.WHITE), 12, 14);
        addObject(new Text("  Press ENTER to replay! ", Color.WHITE), 12, 17);
        playground.level = 0;
        if(playground.music.isPlaying()){
            playground.music.stop();
        }
        GreenfootSound mu = new GreenfootSound("gameover.mp3");
        mu.setVolume(20);
        mu.play();
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("Enter")){
            Greenfoot.setWorld(new playground());
        }
    }
}
