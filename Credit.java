import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends World
{

    /**
     * Constructor for objects of class Credit.
     * 
     */
    public Credit()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        prepare();
    }
    private void prepare()
    {
        Kreator credit = new Kreator();
        addObject (credit, 452,236);
        BackHome backhome = new BackHome();
        addObject(backhome, 816,398);
    }
}
