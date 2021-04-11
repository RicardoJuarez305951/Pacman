import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BigDot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigDot extends Item
{
    /**
     * Act - do whatever the BigDot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BigDot(){
        GreenfootImage image = new  GreenfootImage(50, 50);
        image.setColor(Color.BLUE);
        image.drawOval(0, 0, 40, 40);
        image.fillOval(0, 0, 40, 40);
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
            score.addScore(50);
        }
    }    
}
