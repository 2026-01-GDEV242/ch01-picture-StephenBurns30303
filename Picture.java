/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class is ment to draw an abstract picture using a fun color scheme.
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
    
    private Square fakeBackground;
    private Square background1;
    private Square background2;
    private Square background3;
    
    private Triangle door1;
    private Triangle door2;
    private Triangle door3;
    
    private Person guy1;
    private Person guy2;
    private Person guy3;
    
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sun1= new Circle();
        sun2= new Circle();
        sun3= new Circle();
        
        fakeBackground=new Square();
        background1= new Square();
        background2= new Square();
        background3= new Square();
        
        door1= new Triangle();
        door2= new Triangle();
        door3= new Triangle();
        
        guy1= new Person();
        guy2= new Person();
        guy3= new Person();

        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            fakeBackground.changeColor("white");
            fakeBackground.changeSize(2000);
            fakeBackground.moveHorizontal(-350);
            fakeBackground.moveVertical(-200);
            fakeBackground.makeVisible();
            
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

            door1.changeSize(100,200);
            door1.changeColor("gold");
            door1.makeVisible();
            door1.moveHorizontal(-60);
            door1.moveVertical(100);
            door1.slowMoveVertical(-80);
            door1.slowMoveHorizontal(200);
            
            door2.changeSize(100,200);
            door2.changeColor("magenta");
            door2.makeVisible();
            door2.moveHorizontal(-60);
            door2.moveVertical(100);
            door2.slowMoveVertical(-100);
            door2.slowMoveHorizontal(180);
            
            door3.changeSize(100,200);
            door3.changeColor("purple");
            door3.makeVisible();
            door3.moveHorizontal(-60);
            door3.moveVertical(100);
            door3.slowMoveVertical(-120);
            door3.slowMoveHorizontal(160);
            
            guy1.changeSize(10,10);
            guy1.changeColor("gold");
            guy1.makeVisible();
            guy1.moveVertical(35);
            
            guy2.changeSize(10,10);
            guy2.changeColor("magenta");
            guy2.makeVisible();
            guy2.moveHorizontal(20);
            guy2.moveVertical(35);

            guy3.changeSize(10,10);
            guy3.changeColor("purple");
            guy3.makeVisible();
            guy3.moveHorizontal(40);
            guy3.moveVertical(35);
            
            
            
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        
        fakeBackground.changeColor("black");
        background1.changeColor("white");
        sun1.changeColor("white");
        background2.changeColor("black");
        sun2.changeColor("black");
        background3.changeColor("white");
        sun3.changeColor("white");
        
        door1.changeColor("black");
        door2.changeColor("black");
        door3.changeColor("white");        
        
        guy1.changeColor("black");
        guy2.changeColor("white");
        guy3.changeColor("black");
        
        
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        fakeBackground.changeColor("white");
        background1.changeColor("gold");
        sun1.changeColor("gold");
        background2.changeColor("magenta");
        sun2.changeColor("magenta");
        background3.changeColor("purple");
        sun3.changeColor("purple");
        
        door1.changeColor("gold");
        door2.changeColor("magenta");
        door3.changeColor("purple");        
        
        guy1.changeColor("gold");
        guy2.changeColor("magenta");
        guy3.changeColor("purple");
        

        
        
    }
}
