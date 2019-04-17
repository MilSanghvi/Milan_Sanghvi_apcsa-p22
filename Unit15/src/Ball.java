import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
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
		super(x, y);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x, y, w, h);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h, Color c)
	{
		super(x, y, w, h, c);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xs, int ys)
	{
		super(x, y, w, h, c);
		setXSpeed(xs);
		setYSpeed(ys);
	}	
	
	public Ball(int x, int y, int w, int h, int xs, int ys)
	{
		super(x, y, w, h);
		setXSpeed(xs);
		setYSpeed(ys);
	}
	   
   //add the set methods
   public void setXSpeed(int x)
   {
	   xSpeed = x;
   }

   public void setYSpeed(int y)
   {
	   ySpeed = y;
   }
   
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   //window.setColor(Color.WHITE);
	   //window.fillRect(getX(), getY(), getWidth(), getHeight());
	  draw(window,Color.white);
      
	  setX(getX() + xSpeed);
      setY(getY() + ySpeed);
		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball)obj;
		return(super.equals(other) && this.getXSpeed() == other.getXSpeed() &&
				this.getYSpeed() == other.getYSpeed());
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
		return super.toString() + " " + getXSpeed() + " " + getYSpeed();
	}
}