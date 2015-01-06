import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SchlaegerRComputer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaketKomputer  extends Raket
{
    int pointr = 0;
    int computer = 3;
    
    /**
     * Act - do whatever the SchlaegerR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        winkel();
        computer();
    }    
    
    public void addPointR()
    {
        pointr++;
    }
    
    public int getPointR(){
        return pointr;
    }
    
    public void computer(){
        if(getLapangan().getBall().getY() < getY() && getLapangan().getBall().getX() > getWorld().getWidth() / 2)
        {
            setLocation(getX(), getY() - computer);
        }
        else if(getLapangan().getBall().getY() > getY() && getLapangan().getBall().getX() > getWorld().getWidth() / 2)
        {
            setLocation(getX(), getY() + computer);
        }
    }
}

