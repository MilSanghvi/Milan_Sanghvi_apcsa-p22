//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;
	private boolean collide;

	public Ship()
	{
		this(10,10,50,50,10);
	}

	public Ship(int x, int y)
	{
	   this(x, y, 50, 50, 10);
	}

	public Ship(int x, int y, int s)
	{
	   this(x, y, 10, 10, s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		collide = false;
		try
		{
			//URL url = getClass().getResource("/images/ship.jpg");
			image = ImageIO.read(new File("src/ship.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("There was an error!");
		}
	}


	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public void setCollide(boolean b)
	{
		collide = b;
	}
	
	public boolean getCollide()
	{
		return collide;
	}

	public void move(String direction)
	{
		if(direction.equals("LEFT"))
		{
			if(getX() > 0) setX(getX() - getSpeed());
		}
		else if(direction.equals("RIGHT"))
		{
			if(getX() + getWidth() < 800) setX(getX() + getSpeed());
		}
		else if(direction.equals("UP"))
		{
			if(getY() > 0) setY(getY() - getSpeed());
		}
		else if(direction.equals("DOWN"))
		{
			if(getY() + getHeight() < 580) setY(getY() + getSpeed());
		}
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}