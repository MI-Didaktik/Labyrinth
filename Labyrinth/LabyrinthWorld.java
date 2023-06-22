import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LabyrinthWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LabyrinthWorld extends World
{

    /**
     * Constructor for objects of class LabyrinthWorld.
     * 
     */
    public LabyrinthWorld()
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
        WallHoriz wallHoriz = new WallHoriz();
        addObject(wallHoriz,47,329);
        WallHoriz wallHoriz2 = new WallHoriz();
        addObject(wallHoriz2,216,328);
        WallHoriz wallHoriz3 = new WallHoriz();
        addObject(wallHoriz3,222,239);
        wallHoriz3.setLocation(222,239);
        WallHoriz wallHoriz4 = new WallHoriz();
        addObject(wallHoriz4,222,239);
        WallHoriz wallHoriz5 = new WallHoriz();
        addObject(wallHoriz5,170,156);
        WallHoriz wallHoriz6 = new WallHoriz();
        addObject(wallHoriz6,425,157);
        WallHoriz wallHoriz7 = new WallHoriz();
        addObject(wallHoriz7,272,81);
        WallHoriz wallHoriz8 = new WallHoriz();
        addObject(wallHoriz8,439,52);
        wallHoriz8.setLocation(439,52);
        WallHoriz wallHoriz9 = new WallHoriz();
        addObject(wallHoriz9,439,52);
        WallHoriz wallHoriz10 = new WallHoriz();
        addObject(wallHoriz10,84,66);
        WallHoriz wallHoriz11 = new WallHoriz();
        addObject(wallHoriz11,395,241);
        WallHoriz wallHoriz12 = new WallHoriz();
        addObject(wallHoriz12,423,338);
        WallHoriz wallHoriz13 = new WallHoriz();
        addObject(wallHoriz13,84,215);
        WallHoriz wallHoriz14 = new WallHoriz();
        addObject(wallHoriz14,137,399);
        WallHoriz wallHoriz15 = new WallHoriz();
        addObject(wallHoriz15,214,50);
        WallHoriz wallHoriz16 = new WallHoriz();
        addObject(wallHoriz16,448,125);
        WallHoriz wallHoriz17 = new WallHoriz();
        addObject(wallHoriz17,49,140);
        WallHoriz wallHoriz18 = new WallHoriz();
        addObject(wallHoriz18,549,229);
        WallHoriz wallHoriz19 = new WallHoriz();
        addObject(wallHoriz19,544,84);
        WallHoriz wallHoriz20 = new WallHoriz();
        addObject(wallHoriz20,458,296);
        wallHoriz11.setLocation(380,240);
        WallHoriz wallHoriz21 = new WallHoriz();
        addObject(wallHoriz21,380,240);
        WallHoriz wallHoriz22 = new WallHoriz();
        addObject(wallHoriz22,209,228);
        WallVert wallVert = new WallVert();
        addObject(wallVert,321,195);
        WallVert wallVert2 = new WallVert();
        addObject(wallVert2,418,331);
        WallVert wallVert3 = new WallVert();
        addObject(wallVert3,408,165);
        WallVert wallVert4 = new WallVert();
        addObject(wallVert4,246,85);
        WallVert wallVert5 = new WallVert();
        addObject(wallVert5,156,149);
        WallVert wallVert6 = new WallVert();
        addObject(wallVert6,141,316);
        WallVert wallVert7 = new WallVert();
        addObject(wallVert7,529,74);
        WallVert wallVert8 = new WallVert();
        addObject(wallVert8,534,263);
        WallVert wallVert9 = new WallVert();
        addObject(wallVert9,234,292);
        WallVert wallVert10 = new WallVert();
        addObject(wallVert10,355,63);
        WallVert wallVert11 = new WallVert();
        addObject(wallVert11,62,209);
        WallVert wallVert12 = new WallVert();
        addObject(wallVert12,59,102);
        WallVert wallVert13 = new WallVert();
        addObject(wallVert13,132,71);
        WallVert wallVert14 = new WallVert();
        addObject(wallVert14,67,339);
        WallVert wallVert15 = new WallVert();
        addObject(wallVert15,200,348);
        WallVert wallVert16 = new WallVert();
        addObject(wallVert16,315,334);
        WallVert wallVert17 = new WallVert();
        addObject(wallVert17,274,180);
        WallVert wallVert18 = new WallVert();
        addObject(wallVert18,438,56);
        wallHoriz22.setLocation(356,280);
        wallHoriz21.setLocation(295,7);
        wallVert11.setLocation(33,221);
        wallHoriz10.setLocation(154,292);
        wallVert13.setLocation(102,66);
        Diamond diamond = new Diamond();
        addObject(diamond,33,114);
        Bomb bomb = new Bomb();
        addObject(bomb,470,17);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,444,262);
        Bomb bomb3 = new Bomb();
        addObject(bomb3,184,172);
        Bomb bomb4 = new Bomb();
        addObject(bomb4,332,22);
        Bomb bomb5 = new Bomb();
        addObject(bomb5,44,346);
        Bomb bomb6 = new Bomb();
        addObject(bomb6,176,340);
        Bomb bomb7 = new Bomb();
        addObject(bomb7,56,185);
        Bomb bomb8 = new Bomb();
        addObject(bomb8,333,294);
        Bomb bomb9 = new Bomb();
        addObject(bomb9,253,207);
        Bomb bomb10 = new Bomb();
        addObject(bomb10,124,7);
        wallVert14.setLocation(69,268);
        wallVert15.setLocation(200,318);
        wallHoriz3.setLocation(98,225);
        wallVert15.setLocation(201,320);
        wallHoriz4.setLocation(346,361);
        wallVert16.setLocation(308,321);
        wallVert5.setLocation(154,119);
    }
}
