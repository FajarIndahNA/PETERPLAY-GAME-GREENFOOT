import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Landa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Landa extends Land
{
    /**
     * Act - do whatever the Landa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Landa()
    {
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
