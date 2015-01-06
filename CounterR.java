import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class CounterR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CounterR extends Actor
{
    GreenfootImage bild;
    RaketKanan raket1;
   

    /**
     * Act - do whatever the CounterR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        aktualisiere(20);
//        System.out.println(raket1.getPointR());
    }
    
    public CounterR(RaketKanan sr){
        raket1 = sr;
        bild = new GreenfootImage(150, 50);
        bild.clear();
        bild.setColor(Color.BLUE);
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
        bild.drawString("Points: " + raket1.getPointR(), 0, 20);
        setImage(bild);
    }
}
