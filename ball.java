import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    private int dX = 3;
    private int dY = 3;
    public static int points = 1;
    private int ballPaddleDelay;
    private int delayCounter;
    private int ballResetDelay;
    private int resetCounter;
    
    
    
    /**
     * 
     */
    public ball() 
    {
        ballPaddleDelay = 20;
        delayCounter = 0;
        ballResetDelay = 40;
        resetCounter = 0;
    }
    
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        resetCounter++;
        if(resetCounter >= ballResetDelay)
        {
            move();
        }
        edgeOfWorld();
        paddleInteraction();
        goal();
        checkIfWin();
        delayCounter++;
    }
    
    /**
     * 
     */
    public void move()
    {
        setLocation(getX()+dX, getY()+dY);
    }
    
    /**
     * 
     */
    public void edgeOfWorld()
    {
        if(getY() <= 0 || getY() >= getWorld().getHeight()-1)
        {
            dX = dX;
            dY = -dY;
        }
    }
    
    /**
     * 
     */
    public void paddleInteraction()
    {
        if(delayCounter >= ballPaddleDelay)
        {
            if(isTouching(paddle.class))
            {
            dX = -dX;
            dY = dY;  
            delayCounter = 0;
            }
        }
    }
    
    /**
     * 
     */
    public void goal()
    {
        if(getX() <= 0 || getX() >= getWorld().getWidth()-1)//left side
        {
            points++;
            setLocation(getWorld().getWidth()/2, getWorld().getHeight()/2);
            resetCounter = 0;
        }
    }
    
    /**
     * 
     */
    public void checkIfWin()
    {
        if(points == 8)
        {
            Greenfoot.stop(); 
        }
    }
    
    /**
     * 
     */
    public void ballPaddleDelay(int delayTime)
    {
        ballPaddleDelay = delayTime;
    }
    
    /**
     * 
     */
    public void ballResetDelay(int resetDelay)
    {
        ballResetDelay = resetDelay;
    }
}
