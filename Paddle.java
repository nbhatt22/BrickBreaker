import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class Paddle extends JComponent implements Updatable
{
	
	private Rectangle2D.Double paddle = new Rectangle2D.Double(0,0,15,100);
	private int dx, dy;
	
	public Paddle(int x, int y)
	{
		this.setSize(new Dimension(16,101));
		this.setLocation(x,y);
		
		dx = 0; dy = 0;
		setFocusable(false);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.WHITE);
		g2.fill(paddle);
//		g2.setColor(Color.BLACK);
//		g2.draw(paddle);
	}
	
	public void setDx(int dx)
	{
		this.dx = dx;
	}

	public void setDy(int dy)
	{
		this.dy = dy;
	}
	
	public int getDy()
	{
		return dy;
	}
	
	public int getDx()
	{
		return dx;
	}

	public void updateY()
	{
		this.setLocation(this.getX(), this.getY() + dy);
	}

	public void updateX()
	{
		
	}
	
	public void kill()
	{
		
	}
	
	
}
