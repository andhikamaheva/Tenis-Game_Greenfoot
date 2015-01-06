import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.Color;
/**
 * Write a description of class Status here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Status extends Actor
{
    /**
     * Act - do whatever the Status wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    RaketKanan raket1;
    RaketKiri raket2;
    RaketKomputer raket3;

    public void act() 
    {
        System.out.println(raket1.getPointR());
        if  (raket1.getPointR()==5){
           setImage(new GreenfootImage("Player 2 WIN!!!",100,Color.black,Color.red)); 
        }
    }
    
   
       
        
    
}
