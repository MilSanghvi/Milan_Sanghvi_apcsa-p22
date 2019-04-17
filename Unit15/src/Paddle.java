import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed = 5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y)
   {
	   super(x, y);
	   setSpeed(5);
   }

   public Paddle(int x, int y, int s)
   {
	   super(x, y);
	   setSpeed(s);
   }

   public Paddle(int x, int y, int w, int h, int s)
   {
	   super(x, y, w, h);
	   setSpeed(s);
   }

   public Paddle(int x, int y, int w, int h, Color c, int s)
   {
	   super(x, y, w, h, c);
	   setSpeed(s);
   }


   public void moveUpAndDraw(Graphics window)
   {
	   //draw white paddle where old one was
	   draw(window, Color.WHITE);
	   //make paddle go up
	   if(getY() > 0) setY(getY() - speed); //- speed b/c as y increases, you go down on the grid
	   //draw the paddle at its new location
	   draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	 //draw white paddle where old one was
	   draw(window, Color.WHITE);
	   if(getY() < 600 - getHeight()) setY(getY() + speed);
	   
	   //draw the paddle at its new location
	   draw(window);
   }

   //add get methods
   public void setSpeed(int s)
   {
	   speed = s;
   }
   
   public int getSpeed()
   {
	   return speed;
   }
   
   //add a toString() method
   public String toString()
   {
	   return super.toString() + " " + getSpeed();
   }
}