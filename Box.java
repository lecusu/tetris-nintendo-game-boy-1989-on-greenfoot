import greenfoot.*;

public class Box extends Actor {
    
    String label;
    
    public Box(String label){
        this.label = label;
        GreenfootImage bx = new GreenfootImage("box.png");
        bx.scale(35 * 2, 35 * 3);
        setImage(bx);
        getImage().setColor(Color.BLACK);
        getImage().drawString(label, 18, 15);
    }
    public void setPiece(int type){
        int i =0 , j = 0;
        if (type == 0){
            i = 4; j = 1;
        }
        else if (type == 1){
            i = 2; j = 2;
        }
        else{
            i = 3; j = 2;
        }
        getImage().clear();
        GreenfootImage bx = new GreenfootImage("box.png");
        bx.scale(31 * 4, 35 * 2);
        setImage(bx);
        getImage().setColor(Color.BLACK);
        getImage().drawString(label, 40, 15);
        GreenfootImage pc = new GreenfootImage(type+"_piece.png");
        pc.scale(25*i, 25*j);
        getImage().drawImage(pc, 25, 22);
    }
}
