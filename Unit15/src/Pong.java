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

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle, rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int scoreRight, scoreLeft;
	private Wall rightWall, leftWall, topWall, botWall;
	
	public Pong()
	{
		//set up all variables related to the game
		ball = new BlinkyBall();
		leftPaddle = new Paddle(20, 10, 10, 70, Color.RED, 5);
		rightPaddle = new Paddle(770, 10, 10, 70, Color.RED, 5);
		keys = new boolean[4];
		scoreRight = 0;
		scoreLeft = 0;
		rightWall = new Wall(790, 0, 10, 600, Color.WHITE);
		leftWall = new Wall(0, 0, 10, 600, Color.WHITE);
		topWall = new Wall(0, 0, 800, 10, Color.WHITE);
		botWall = new Wall(0, 500, 800, 10, Color.WHITE);
    
    	setBackground(Color.WHITE);
		setVisible(true); 
		
		this.addKeyListener(this);		
		new Thread(this).start();	
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		
		Graphics2D twoDGraph = (Graphics2D)window;

		
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.RED);
		
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		
				
		if(ball.getX() <= leftWall.getX() + leftWall.getWidth())
		{
			if(ball.getXSpeed() != 0) scoreRight++;
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(graphToBack, Color.WHITE);
			
			try
			{
				Thread.currentThread().sleep(950);
			}catch(Exception e){ }
			//set position and speed
			ball.setX((int)(Math.random() * 400));
			ball.setY((int)(Math.random() * 400));
			ball.setXSpeed(2);
			ball.setYSpeed(1);	
		}
		
		if(ball.getX() + ball.getWidth() >= rightWall.getX())
		{	
			if(ball.getXSpeed() != 0) scoreLeft++;
			
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(graphToBack, Color.WHITE);
			
			try
			{
				Thread.currentThread().sleep(950);
			}catch(Exception e){ }
			//set position and speed
			ball.setX((int)(Math.random() * 400));
			ball.setY((int)(Math.random() * 400));
			ball.setXSpeed(2);
			ball.setYSpeed(1);	
		}
		
		
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(440,  520,  80,  80);
		graphToBack.fillRect(640,  520, 100, 100);
		graphToBack.fillRect(140, 520, 100, 100);
		
		graphToBack.setColor(Color.RED);
		
		graphToBack.drawString("Right Player: " + scoreRight, 400, 540);
		graphToBack.drawString("Left Player: " + scoreLeft, 400, 560);
	
		
		if(ball.getY() + ball.getHeight() >= botWall.getY() || ball.getY() <= topWall.getY())
		{
			ball.setYSpeed(-ball.getYSpeed());
			ball.setColor(((BlinkyBall)ball).randomColor());
		}

		
		if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed())
				&& (ball.getY() >= leftPaddle.getY() 
					&& ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()
						|| ball.getY() + ball.getHeight() >= leftPaddle.getY() 
						&& ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight()))
		{
			if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()))
				{
					(ball).setYSpeed(-ball.getYSpeed());
					if(ball.getXSpeed() != 0) ball.setColor(((BlinkyBall)ball).randomColor());
				}
			else 
			{
				ball.setXSpeed(-ball.getXSpeed());
				if(ball.getYSpeed() != 0) ball.setColor(((BlinkyBall)ball).randomColor());
			}			
		}
			
		
		if(ball.getX() >= rightPaddle.getX() - rightPaddle.getWidth() + Math.abs(ball.getXSpeed())
				&& (ball.getY() >= rightPaddle.getY() 
					&& ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()
						|| ball.getY() + ball.getHeight() >= rightPaddle.getY()
						&& ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight()))
		{
			
			if(ball.getX() >= rightPaddle.getX() - Math.abs(ball.getXSpeed()))
			{
				ball.setYSpeed(-ball.getYSpeed());
				if(ball.getXSpeed() != 0) ball.setColor(((BlinkyBall)ball).randomColor());
			}
			else
			{
				System.out.println(ball.getXSpeed());
				ball.setXSpeed(-ball.getXSpeed());
				System.out.println(ball.getXSpeed());
				if(ball.getYSpeed() != 0) ball.setColor(((BlinkyBall)ball).randomColor());

			}
		}
		
		
		if(keys[0]) leftPaddle.moveUpAndDraw(graphToBack); //need to use graphToBack instead of window 
		if(keys[1]) leftPaddle.moveDownAndDraw(graphToBack);
		if(keys[2]) rightPaddle.moveUpAndDraw(graphToBack);
		if(keys[3]) rightPaddle.moveDownAndDraw(graphToBack);
		
		
		graphToBack.setColor(Color.RED);
		graphToBack.drawString("Left Player Score: " + scoreLeft + "\nRight Player Score: " + scoreRight, 100, 600);

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'K' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'K' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}