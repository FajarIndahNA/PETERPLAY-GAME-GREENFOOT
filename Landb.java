import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Landb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Landb extends Land
{
    /**
     * Act - do whatever the Landb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Landb()
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
