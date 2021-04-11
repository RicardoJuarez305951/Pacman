import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cherry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cherry extends Fruit
{
    /**
     * Act - do whatever the Cherry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cherry(){
        setImage("images/cherries.png");
    }
    public void act() 
    {
        Actor Pacman = getOneIntersectingObject(Pacman.class);
        if (Pacman != null) {
            World myWorld = getWorld();
            myWorld.removeObject(this);
            PacmanLevel Level = (PacmanLevel)myWorld;
            ScoreBoard score = Level.getScore();
            score.addScore(40);
        }
    }    
}
