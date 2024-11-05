import greenfoot.*;
public class Text extends Actor {
    public Text(String text, Color color) {
        
        setImage(new GreenfootImage(200, 50));
        getImage().setColor(color);
        getImage().drawString(text, 20,20);
    }
    public void update(String text) {
        getImage().clear();
        getImage().drawString(text, 20,20);
    }
}
