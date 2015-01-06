import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SchlaegerR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaketKanan  extends Raket
{
    int pointr = 0;
    int computer = 3;
    
    /**
     * Act - do whatever the SchlaegerR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        steuerung();
        winkel();
    }    
    
    public void steuerung()
    {
        if(Greenfoot.isKeyDown("up") && !Oben())
        {
            setLocation(getX(), getY() - 3);
        }
        if(Greenfoot.isKeyDown("down") && !Unten())
        {
            setLocation(getX(), getY() + 3);
        }
    }
    
    public void addPointR()
    {
        pointr++;
    }
    
    public int getPointR(){
        return pointr;
    }
    
}

