import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bola extends Actor
{
    
    boolean hasBounced;
    int speed = 6;
    int hits = 0;
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fly();
        bewege();
        flugschlaeger();
        checkRandlr();
        faster();

    }    
    
    public void faster()
    {
        if(hits > 2)
        {
            speed = 7;
        }
        if(hits > 6)
        {
            speed = 9;
        }
        if(hits > 10)
        {
            speed = 13;
        }
    }
    
    public void flugschlaeger(){
        if(foundSchlaegerL()){
            setRotation(getRotation() - 180);
            Greenfoot.playSound("ping.wav");
            hits++;
        }
        else if(foundSchlaegerR()){
            setRotation(getRotation() + 180);
            Greenfoot.playSound("pong.wav");
            hits++;
        }
        else if(foundSchlaegerRComputer()){
            setRotation(getRotation() + 180);
            Greenfoot.playSound("pong.wav");
            hits++;
        }
    }    
    
    public void fly(){     
        if(Oben()){
                bounceVertical();
                hasBounced = true;
        }else if(Unten()){
                bounceVertical();
                hasBounced = true;
        }else{
                hasBounced = false;
        }
    }   
    
    public void bounceVertical(){
        if(!hasBounced) setRotation(getRotation() * -1);
    }
    
    public void checkRandlr()
    { 
        if(Rechts()){
            resetBall();
            getLapangan().getL().addPointL();
        }
        else if(Links()){
            resetBall();
            getLapangan().getR().addPointR();
        }
    } 
    
    public void bewege()
    {
        move(speed);
    }     
    
    public void resetBall()
    {
        setLocation(getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        getLapangan().getR().setLocation(740, 250);
        getLapangan().getL().setLocation(60, 250);
        speed = 3;
        hits = 0;
        Greenfoot.delay(60);
        setRotation(Greenfoot.getRandomNumber(2) * 180);
    }
    
    public boolean foundSchlaegerL()
    {
       Actor sl= getOneIntersectingObject(RaketKiri.class);
       if (sl != null) 
       {
         return true;
       }
       else 
       {       
          return false;   
       }
    }
    
    public boolean foundSchlaegerR()
    {
       Actor sr= getOneIntersectingObject(RaketKanan.class);
       if (sr != null) 
       {
         return true;
       }
       else 
       {       
          return false;   
       }
    }
    
    public boolean foundSchlaegerRComputer()
    {
       Actor sr= getOneIntersectingObject(RaketKomputer.class);
       if (sr != null) 
       {
         return true;
       }
       else 
       {       
          return false;   
       }
    }
    
    public boolean Oben(){
        if(getY() < getImage().getHeight() / 2){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean Unten(){
        if(getY() > getWorld().getHeight() -  getImage().getHeight() / 2){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean Links(){
        if(getX() < getImage().getWidth() / 5){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean Rechts(){
        if(getX() > getWorld().getWidth() - getImage().getWidth() / 5){
            return true;
        }else{
            return false;
        }
    }
    
    public Lapangan getLapangan(){
        return (Lapangan)getWorld();
    }
    
}
