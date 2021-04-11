import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LittleDot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LittleDot extends Item
{
    /**
     * Act - do whatever the LittleDot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public LittleDot(){
        GreenfootImage image = new  GreenfootImage(25, 25);
        image.setColor(Color.GREEN);
        image.drawOval(0, 0, 20, 20);
        image.fillOval(0, 0, 20, 20);
        this.setImage(image);
    }
    public void act() 
    {
        Actor Pacman = getOneIntersectingObject(Pacman.class);
        if (Pacman != null) {
            World myWorld = getWorld();
            myWorld.removeObject(this);
            PacmanLevel Level = (PacmanLevel)myWorld;
            ScoreBoard score = Level.getScore();
            score.addScore(10);
        }
    }    
}
