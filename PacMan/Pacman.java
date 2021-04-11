import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacman extends Actor
{
    private static final int OFFSET = 5;
    private int currentImage;
    private int counter;

    public Pacman()
    {
        setImage("images/pacman-close.png");
    }

    /**
     * Act - do whatever the Pacman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveMouth();
        
        handleDirection();
        
        Teleport();
    }
    
    public void Teleport()
    {
        
        if (this.isTouching(LeftTeleporter.class))
        {
            setLocation(getX()+600, getY());
        }
        else if (this.isTouching(RightTeleporter.class))
        {
            setLocation(getX()-600, getY());
        }
    }
    
    public void eatFruit()
    {
        /*
        Actor Pacman = getOneIntersectingObject(Pacman.class);
        if (Pacman != null) {
            World myWorld = getWorld();
            myWorld.removeObject(this);
            PacmanLevel Level = (PacmanLevel)myWorld;
            ScoreBoard score = Level.getScore();
            score.addScore(30);
        }
    }*/
}
    
    public void handleDirection(){
        int x = getX();
        int y = getY();
        
        Actor Wall = getOneIntersectingObject(Wall.class);
        if(Greenfoot.isKeyDown("right")){
            setLocation(x + OFFSET, y);
            if (Wall != null){
                setLocation(x - OFFSET - 10, y);
            }
        }
        else if(Greenfoot.isKeyDown("left")){
            setLocation(x - OFFSET, y);
            if (Wall != null){
                setLocation(x + OFFSET + 10, y);
            }
        }
        else if(Greenfoot.isKeyDown("down")){
            setLocation(x, y + OFFSET);
            if (Wall != null){
                setLocation(x, y - OFFSET - 10);
            }
        }
        else if(Greenfoot.isKeyDown("up")){
            setLocation(x, y - OFFSET);
            if (Wall != null){
                setLocation(x, y + OFFSET + 10);
            }
        }
    }

    public void moveMouth(){
        if(counter == 0){
            if(currentImage == 0){
                setImage("images/pacman-close.png");
            } else if (currentImage == 1){
                setImage("images/pacman-open.png");
            }

            currentImage = (currentImage + 1) % 2;
        }
        counter = (counter + 1)%10;
    }
    
    
}
