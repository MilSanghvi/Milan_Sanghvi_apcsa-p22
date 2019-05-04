//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	//will implement collidable interface
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y)
	{
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x,y, w, h);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color c)
	{
		super(x,y, w, h, c);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xS, int yS)
	{
		super(x,y, w, h, c);
		setXSpeed(xS);
		setYSpeed(yS);
	}

	   
   //add the set methods
	public void setXSpeed(int xS)
	{
		xSpeed = xS;
	}
	
	public void setYSpeed(int yS)
	{
		ySpeed = yS;
	}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  draw(window, Color.white);
	  
      super.setX(getX()+xSpeed);
      super.setY(getY()+ySpeed);

		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball p = (Ball)obj;
		if (this.getXSpeed() == p.getXSpeed() &&
			this.getYSpeed() == p.getYSpeed() &&
			super.getX() == p.getX() &&
			super.getY() == p.getY() &&
			super.getHeight() == p.getHeight() &&
			super.getWidth() == p.getWidth() &&
			super.getColor().equals(getColor())) return true;
		
		return false;
	}   

   //add the get methods
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
	
   //add a toString() method
	public String toString()
	{
		return super.toString() + " " + xSpeed + " " + ySpeed;
	}
}
