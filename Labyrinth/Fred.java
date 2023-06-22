import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fred here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fred extends Actor
{
    /**
     * Act - do whatever the Fred wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("up")) {setRotation(270); move(10);}
        if(Greenfoot.isKeyDown("down")) {setRotation(90); move(10);}
        if(Greenfoot.isKeyDown("left")) {setRotation(180); move(10);}
        if(Greenfoot.isKeyDown("right")) {setRotation(0); move(10);}
        sammleDiamanten(); 
        //sammleBombe(); 
    }
    
    public void sammleDiamanten(){
        getWorld().removeObjects(getObjectsInRange(20, Diamond.class)); 
    }
    
    //public void sammleBombe(){
    //    if(isTouching(Bombe.class)){
     //       getWorld().removeObject(Fred.class); 
      //      Fred fred = new Fred();
      //      addObject(fred, 20, 380);
      //  }
    //}
}
