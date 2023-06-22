import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LabyrinthWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LabyrinthWorld2 extends World
{

    /**
     * Constructor for objects of class LabyrinthWorld2.
     * 
     */
    public LabyrinthWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Diamond diamond = new Diamond();
        addObject(diamond,438,249);
        Fred fred = new Fred();
        addObject(fred,17,375);
        diamond.setLocation(134,327);
    }
}
