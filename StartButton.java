import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    /**
     * StartButton is the cpmstructor for objects of type StartButton
     * 
     * @param There are no parameters
     * @return an object of type StartButton
     */
    public StartButton()
    {
        GreenfootImage buttonImage = new GreenfootImage( 100, 100 );
        
        buttonImage.setColor( Color.BLACK );
        buttonImage.fillOval( 0, 0, 100, 100 );
        
        buttonImage.setColor( Color.BLUE );
        buttonImage.fillOval( 3, 3, 94, 94 );
        
        buttonImage.drawImage( new GreenfootImage( "START", 30, Color.WHITE, new Color(0,0,0,0) ), 12, buttonImage.getHeight()*3/8 ); 
        
        setImage( buttonImage );
    }
    
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        if( Greenfoot.mouseClicked( this ) )
        {
            Greenfoot.setWorld( new PlayerWorld() );
        }
    }    
}






















