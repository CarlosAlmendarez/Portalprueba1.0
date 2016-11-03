import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceWorld extends World
{
    dolphin D;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public SpaceWorld()
    {    
        super(800, 600, 1);
        D = new dolphin();
        addObject(D,400,300);
    }
    
    /**
     * teleport saca en una lista los objetos de tipo Portal y escoge una posicion aleatoria de la lista para sacar al delfin a algun otro portal
     */
    public void teleport(int x)
    {
        Portal p;
        int a;
        List L;
        L=getObjects(Portal.class);
        
        a=Greenfoot.getRandomNumber(L.size());
        p=(Portal)L.get(a);
        if(p.getX()!=x) //validacion para que no salga por el mismo portal
        {
           D.setLocation(p.getX()+80,p.getY());
        }
    }
}
