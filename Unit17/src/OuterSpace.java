//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private Ammo ammo;

    private AlienHorde horde;
	private Bullets shots;
	

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(10, 540);
		horde = new AlienHorde(60);
		shots = new Bullets();
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		ship.draw(graphToBack);
		horde.removeDeadOnes(shots.getList());
		horde.drawEmAll(graphToBack);
		horde.moveEmAll();
		
		shots.cleanEmUp();
		shots.drawEmAll(graphToBack);
		shots.moveEmAll();
		
		//horde.collideWithShip(ship, graphToBack, shots);		
		//move ship
		if(keys[0]) ship.move("LEFT");	
		if(keys[1]) ship.move("RIGHT");
		if(keys[2]) ship.move("UP");
		if(keys[3]) ship.move("DOWN");
		if(keys[4])
		{
			shots.add(new Ammo(ship.getX() + ship.getWidth()/2, ship.getY(), 5));
			keys[4] = false;
		}

		
				for(Alien alien : horde.getList())
				{
					//collide left, collide right/ collide top, collide bottom		
					if((alien.getX() + alien.getWidth() + Math.abs(alien.getSpeed()) >= ship.getX() 
							&& alien.getX() <= ship.getX()
							&& alien.getY() >= ship.getY() 
							&& alien.getY() + alien.getHeight() <= ship.getY() + ship.getHeight()) 
						|| (alien.getX() - Math.abs(alien.getSpeed()) <= ship.getX() + ship.getWidth() 
							&& alien.getX() >= ship.getX()
							&& alien.getY() >= ship.getY() 
							&& alien.getY() + alien.getHeight() <= ship.getY() + ship.getHeight()
						|| (ship.getY() - Math.abs(ship.getSpeed()) <= alien.getY() + alien.getHeight() 
							&& alien.getY() < ship.getY()
							&& alien.getX() >= ship.getX() 
							&& alien.getX() + alien.getWidth() <= ship.getX() + ship.getWidth())
						|| (alien.getY() <= ship.getY() + ship.getHeight() + Math.abs(ship.getSpeed()) 
							&& alien.getY() > ship.getY()
							&& alien.getX() >= ship.getX() 
							&& alien.getX() + alien.getWidth() <= ship.getX() + ship.getWidth())))
					{
						ship.setSpeed(0);
						ship.setCollide(true);
						for(Alien a : horde.getList()) a.setSpeed(0);
						break;
					}
				}
				
		if(ship.getCollide())
		{
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("You lose!", 400, 540);
		}
		
		if(horde.getList().size() == 0)
		{
			graphToBack.setColor(Color.GREEN);
			graphToBack.drawString("You win!", 400, 540);
		}
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}