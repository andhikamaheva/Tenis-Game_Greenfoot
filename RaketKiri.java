import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SchlaegerL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaketKiri  extends Raket
{
    int pointl = 0;
    /**
     * Act - do whatever the SchlaegerL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        steuerung();
        winkel();
    }    
    
    public void steuerung()
    {
        if(Greenfoot.isKeyDown("w") && !Oben())
        {
            setLocation(getX(), getY() - 3);
        }
        if(Greenfoot.isKeyDown("s") && !Unten())
        {
            setLocation(getX(), getY() + 3);
        }
    }
    
    public void addPointL()
    {
        pointl++;
    }
    
    public int getPointL(){
        return pointl;
    }
    
}
