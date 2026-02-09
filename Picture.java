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
            
            background1.changeSize(500);
            background1.changeColor("gold");
            background1.makeVisible();
            background1.moveVertical(40);
            background1.moveHorizontal(-150);
            background1.slowMoveHorizontal(-30);
            
            sun1.changeSize(100);
            sun1.changeColor("sky");
            sun1.makeVisible();
            sun1.slowMoveHorizontal(150);
            sun1.changeColor("gold");            
            sun1.slowMoveVertical(-50);            
            
            background2.changeSize(600);
            background2.changeColor("magenta");
            background2.makeVisible();
            background2.moveVertical(20);
            background2.moveHorizontal(-100);
            background2.slowMoveHorizontal(-60);            

            sun2.changeSize(100);
            sun2.changeColor("pink");
            sun2.makeVisible();
            sun2.moveVertical(60);
            sun2.slowMoveHorizontal(100);
            sun2.changeColor("magenta");
            sun2.slowMoveVertical(-100);            
            
            background3.changeSize(600);
            background3.changeColor("purple");
            background3.makeVisible();
            background3.moveVertical(0);
            background3.moveHorizontal(-50);
            background3.slowMoveHorizontal(-90); 
                    
            sun3.changeSize(100);
            sun3.changeColor("blue");
            sun3.moveVertical(120);
            sun3.makeVisible();
            sun3.slowMoveHorizontal(50);
            sun3.changeColor("purple");
            sun3.slowMoveVertical(-150);
            
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
