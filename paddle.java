import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paddle extends Actor
{
    int paddletype;
    public paddle(int paddletype)
    {
        this.paddletype = paddletype;
    }

    /**
     * Act - do whatever the paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        keydown();  
    }

    public void keydown()
    {
        if(paddletype == 1)
        {
            if(Greenfoot.isKeyDown("w"))
            {
                setLocation(getX()+0,getY()-5);
            }
            if(Greenfoot.isKeyDown("s"))
            {
                setLocation(getX()+0,getY()+5);
            } 
        }
        
        if(paddletype == 2)
        {
            if(Greenfoot.isKeyDown("up"))
            {
                setLocation(getX()+0,getY()-5);
            }
            if(Greenfoot.isKeyDown("down"))
            {
                setLocation(getX()+0,getY()+5);
            } 
        }

    }
}

