import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Landc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Landc extends Land
{
    /**
     * Act - do whatever the Landc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Landc()
    {
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/3, image.getHeight()/3);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
