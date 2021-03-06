import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: Malinda (Linhui Huang)
 * Course: CS30S
 * Teacher: Mr. Hardman
 * Lab #1, Program #0
 * Date Last Modified: February 22nd, 2018
 */
public class StartMenu extends World
{
    private GreenfootImage startBackground = new GreenfootImage( "battleship2.jpg" );
    

    /**
     * StartMenu is the constructor for objects of type StartMenu
     * 
     * @param There are no parameters
     * @return an object of type StartMenu
     */
    public StartMenu()
    {    
        // Create a new world with 1080x720 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1); 
        
        startBackground.scale( getWidth(), getHeight() );
        
        setBackground( startBackground );
        
        addObject( new StartButton(), getWidth()/2, getHeight() - 100 );
    }
}
