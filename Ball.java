import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ball extends JComponent implements Updatable
{
	private Ellipse2D.Double circle = new Ellipse2D.Double(0,0,14,14);
	private int dx, dy;
	
	public Ball(int x, int y)
	{
		this.setSize(new Dimension(15,15));
		this.setLocation(x,y);
		
		dx = 0; dy = 0;
		setFocusable(false);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.WHITE);
		g2.fill(circle);
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
	
	public void bounceY()
	{
		this.dx = -dx;
	}
	
	public void bounceX()
	{
		this.dy = -dy;
	}
	
	public void updateY()
	{
		this.setLocation(this.getX(), this.getY() + dy);
	}

	public void updateX()
	{
		this.setLocation(this.getX()  + dx, this.getY());
	}

	public void kill() 
	{
		
	}

}
