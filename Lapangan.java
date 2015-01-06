import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ping here.
 * 
 * @author (RoJo) 
 * @version (2.0)
 */
public class Lapangan  extends World
{
    Bola ba = new Bola();
    RaketKanan raket1 = new RaketKanan();
    RaketKiri raket2 = new RaketKiri(); 
    RaketKomputer raket3 = new RaketKomputer(); 
    CounterR cr = new CounterR(raket1);
    CounterL cl = new CounterL(raket2);
    GreenfootImage gi1 = new GreenfootImage("button1.png");
    GreenfootImage gi2 = new GreenfootImage("button2.png");
    Tombol bt1 = new Tombol(250, 100, "", 0, gi1);
    Tombol bt2 = new Tombol(250, 100, "", 1, gi2);

    /**
     * Constructor for objects of class Ping.
     * 
     */
    public Lapangan()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 

        addObject(bt1, 200, 250);
        addObject(bt2, 600, 250);
        
        Greenfoot.start();
    }

    public void prepare2Player()
    {
        addObject(raket1, 60, 250);
        addObject(raket2, 740, 250);
        addObject(ba, 400, 250);
        addObject(cr, 732, 445);
        addObject(cl, 129, 445);
    }
    
    public void prepare1Player()
    {
        addObject(raket2, 60, 250);
        addObject(raket3, 740, 250);
        addObject(ba, 400, 250);
        addObject(cr, 732, 445);
        addObject(cl, 129, 445);
    }
    
    public Bola getBall(){
        return ba;
    }
    
    public RaketKanan getR(){
        return raket1;
    }
    
    public RaketKiri getL(){
        return raket2;
    }
    
    public void remove(){
        removeObjects (getObjects(Tombol.class));
    }
    
}
