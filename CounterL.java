import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class CounterR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CounterL extends Actor
{
    GreenfootImage bild;
    RaketKiri raket2;
    RaketKanan raket1;
    RaketKomputer raket3;
    /**
     * Act - do whatever the CounterR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        aktualisiere(20);
       
        
    }
    
    public CounterL(RaketKiri sl){
        raket2 = sl;
        bild = new GreenfootImage(150, 50);
        bild.clear();
        bild.setColor(Color.RED);
        setImage(bild);
        aktualisiere(20);
    }
    
    public void aktualisiere(int pRaket)
    {
        GreenfootImage bild = getImage();
        Font font = bild.getFont();
        bild.clear();
        font = font.deriveFont(1, pRaket);
        bild.setFont(font);
        bild.drawString("Points: " + raket2.getPointL(), 0, 20);
        setImage(bild);
    }
}
