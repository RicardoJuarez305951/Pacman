import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    int score = 0;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    
    public void addScore(int score){
        this.score += score;
    }
    
    public void act() 
    {
        setImage(new  GreenfootImage("Puntos: " + score, 40,Color.BLACK, null));
    }    
}
