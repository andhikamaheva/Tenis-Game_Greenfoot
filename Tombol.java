import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.List;

/**
 * Write a description of class CounterR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tombol  extends Actor
{

    private int funktion;
    private String name;
    private boolean funktionAusgefuehrt;
    
    public Tombol(int width, int height, String pName, int pFunktion, GreenfootImage pImage){
        name = pName;
        GreenfootImage image = pImage;        
        image.drawString(pName, width/2 -pName.length()*3, height/2);
        funktion = pFunktion;
        setImage(image);
    }
    
    /**
     * Act- Methode- Bestimmt das Verhalten.
     */
    public void act() 
    {
        anklicken();
    }

    /**
     * Diese Methode bestimmt, welcher Button welche Aktion ausführen soll, falls auf ihn geklickt wurde. Falls ihr mehr als zwei Funktionen 
     * benötigt, orientiert euch an dem bereits vorhandenen Code
     */
    public void anklicken(){
        MouseInfo meineMaus = Greenfoot.getMouseInfo();
        if(meineMaus != null){
            if(funktion==0 && Greenfoot.mouseClicked(this)){   
               getLapangan().prepare1Player();
               ((Lapangan) getWorld()).remove();
               Greenfoot.delay(60);
            }
            
            if(funktion==1 && Greenfoot.mouseClicked(this)){   
                getLapangan().prepare2Player();
                ((Lapangan) getWorld()).remove();
                Greenfoot.delay(60);
            }
        }
    }
    
    public Lapangan getLapangan(){
        return (Lapangan)getWorld();
    }
}
