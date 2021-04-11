import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftTeleporter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftTeleporter extends Teleporter
{
    /**
     * Act - do whatever the LeftTeleporter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public LeftTeleporter(){
        GreenfootImage image = new  GreenfootImage(50, 50);
        image.setColor(Color.WHITE);
        image.fillRect(0, 0, 100, 100);
        image.fillRect(0, 0, 100, 100);
        this.setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
