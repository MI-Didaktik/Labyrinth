import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallHoriz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallHoriz extends Actor
{
    public WallHoriz (){
        GreenfootImage image = getImage();
        image.scale(image.getWidth(),image.getHeight()-100);
    }
    /**
     * Act - do whatever the WallHoriz wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
