/**
 * The Vector class represents a 2D vector with an x and y component.
 * It provides various methods for performing vector movimentation and rotation.
 */
public class Vector {
    
    /**
     * The x-component and y-component of this vector.
     */
    public int x, y;
    
    /**
     * A vector pointing up (in the negative y-direction).
     */
    public static Vector Up = new Vector(0, -1);
    
    /**
     * A vector pointing down (in the positive y-direction).
     */
    public static Vector Down = new Vector(0, 1);
    
    /**
     * A vector pointing right (in the positive x-direction).
     */
    public static Vector Right = new Vector(1, 0);
    
    /**
     * A vector pointing left (in the negative x-direction).
     */
    public static Vector Left = new Vector(-1, 0);
    
    /**
     * A vector with zero length (components are both zero).
     */
    public static Vector Zero = new Vector(0, 0);
    
    /**
     * Constructs a new Vector object with the given x and y components.
     * 
     * @param x The x-component of the new vector.
     * @param y The y-component of the new vector.
     */
    public Vector(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    /*
    /**
     * Alternative method add using tail call
     * Returns the result of adding this vector with another vector.
     * This operation is not commutative (i.e., this.add(other) != other.add(this)).
     * 
     * @param other The other vector to add to this vector.
     * @return The sum of this vector and the other vector.
     */
    /*
    public Vector add(Vector other) {
        return add(other, Zero);
    }

    
    private Vector add(Vector other, Vector accum) {
        if (other.equals(Zero)) {
            return accum.add(this);
        } else {
            return add(other.sub(Up), accum.add(Up));
        }
    }
    */
    
    /**
    *
    * Adds a given vector to the current vector and returns the result as a new Vector object.
    *
    * @param other the vector to be added to the current vector
    *
    * @return a new Vector object representing the result of adding the current vector and the given vector
    */
    public Vector add(Vector other){
        int newX = other.x + this.x;
        int newY = other.y + this.y;
        
        return new Vector(newX, newY);
    }
    
    /**
     * Returns the result of subtracting another vector from this vector.
     * 
     * @param other The other vector to subtract from this vector.
     * @return The difference between this vector and the other vector.
     */
    public Vector sub(Vector other){
        int newX = other.x - this.x;
        int newY = other.y - this.y;
        
        return new Vector(newX, newY);
    }
    
    /**
     * Updates the x and y components of this vector.
     * 
     * @param newX The new x-component for this vector.
     * @param newY The new y-component for this vector.
     */
    public void update(int newX, int newY){
        x = newX;
        y = newY;
    }
    
    /**
     * Returns a string representation of this vector.
     * 
     * @return A string representation of this vector in the format "Vector (x,y)".
     */
    public String toString(){
        return "Vector ("+x +"," + y + ")" ;
    }
    
    /**
     * Rotates this vector by 90 degrees in either the clockwise or counter-clockwise direction.
     * 
     * @param clockwise Whether to rotate this vector clockwise or counter-clockwise.
     */
    public void rotate90(boolean clockwise){
        Vector[] ccw = { new Vector(0,-1), new Vector(1,0)};
        Vector[] cw = { new Vector (0,1), new Vector(-1,0)};
        Vector[] rotation = clockwise? cw:ccw;
        
        int xRot = (rotation[0].x * x) + (rotation[1].x * y);
        int yRot = (rotation[0].y * x) + (rotation[1].y * y);
        
        update(xRot, yRot);
    }
}
