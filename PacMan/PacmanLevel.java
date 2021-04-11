import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanLevel extends World
{
    ScoreBoard scoreBoard = new ScoreBoard();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public ScoreBoard getScore(){
        return scoreBoard;
    } 
    public PacmanLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        //////////WALLS//////////
        //Inner Box
        for(int x = 250; x < 550; x+=72){
            this.addObject(new Wall(), x, 350);
        }
        for(int x = 250; x < 350; x+=72){
            this.addObject(new Wall(), x, 200);
        }
        for(int x = 538; x > 400; x-=72){
            this.addObject(new Wall(), x, 200);
        }
        for(int y = 250; y < 350; y+=56){
            this.addObject(new Wall(), 250, y);
            this.addObject(new Wall(), 538, y);
        }
        
        
        //Top-Bot Sides
        for(int x = 0; x < 800; x+=72){
            this.addObject(new Wall(), x, 30);
            this.addObject(new Wall(), x, 570);
        }
        
        //Left-Right Sides
        for(int y = 30; y < 200; y+=56){
            this.addObject(new Wall(), 30, y);
            this.addObject(new Wall(), 765, y);
            
            this.addObject(new Wall(), 30, y+320);
            this.addObject(new Wall(), 765, y+320);
        }
        //////////WALLS//////////
        
        //////////FRUITS//////////
        addObject(new Banana(), 400,280);
        addObject(new Cherry(), 400,440);
        //////////FRUITS//////////
        
        
        //////////ITEMS//////////
        for(int x = 100; x < 750; x+=60){
            addObject(new LittleDot(), x, 100);
            addObject(new LittleDot(), x, 500);
        }
        
        addObject(new BigDot(), 150, 270);
        addObject(new BigDot(), 650, 270);
        
        addObject(new LeftTeleporter(), 30,270);
        addObject(new RightTeleporter(), 750,270);
        //////////ITEMS//////////
        
        //////////CHARACTERS//////////
        addObject(new Pacman(), 150, 400);
        
        addObject(scoreBoard, 100, 40);
        //addObject(new Phantom(), 250, 100);
        //////////CHARACTERS//////////       
        
    }
}
