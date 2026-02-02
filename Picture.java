/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Stephen M. Burns
 * @version 2026.02.02
 */
public class Picture
{
    private Circle sun1;
    private Circle sun2;
    private Circle sun3;
    
    private Square plane1;
    private Square plane2;
    private Square plane3;
    
    private Square background1;
    private Square background2;
    private Square background3;
    
    private Triangle door1;
    private Triangle door2;
    private Triangle door3;
    
    private Person priest1;
    private Person priest2;
    private Person priest3;
    
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sun1= new Circle();
        sun2= new Circle();
        sun3= new Circle();
        
        plane1= new Square();
        plane2= new Square();
        plane3= new Square();
        
        background1= new Square();
        background2= new Square();
        background3= new Square();
        
        door1= new Triangle();
        door2= new Triangle();
        door3= new Triangle();
        
        priest1= new Person();
        priest2= new Person();
        priest3= new Person();

        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        
    }
}
