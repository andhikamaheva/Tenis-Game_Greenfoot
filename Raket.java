import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Schlaeger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Raket  extends Actor
{
    /**
     * Act - do whatever the Schlaeger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }  
    
    public void winkel()
    {
        int diffY = getY() - getLapangan().getBall().getY(); 
        if(foundBall() && getX() < 400)
        {
                    getLapangan().getBall().setRotation(diffY * -1 + getZahl(20));
        }
        else if(foundBall() && getX() > 400)
        {
                    getLapangan().getBall().setRotation(diffY + 180 + getZahl(20));
        }
    }
    
    public int getZahl(int zahl){
        return Greenfoot.getRandomNumber(zahl) - zahl / 2;
    }
    
    public boolean foundBall()
    {
       Actor sl= getOneIntersectingObject(Bola.class);
       if (sl != null) 
       {
         return true;
       }
       else 
       {       
          return false;   
       }
    }
    
    public Lapangan getLapangan(){
        return (Lapangan)getWorld();
    }
    
    public boolean Oben(){
        if(getY() < getImage().getHeight() / 2){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean Unten(){
        if(getY() > getLapangan().getHeight() - getImage().getHeight() / 2){
            return true;
        }else{
            return false;
        }
    }
}
