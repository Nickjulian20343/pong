import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1); 
        ball ball = new ball();
        addObject(ball,getWidth()/2, getHeight()/2);
        addObject(new paddle(1),50, getHeight()/2);
        addObject(new paddle(2),getWidth()-50, getHeight()/2);
    }
}
