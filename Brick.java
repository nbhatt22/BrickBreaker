import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class Brick extends JComponent implements Updatable
{
	
	private Rectangle2D.Double brick = new Rectangle2D.Double(0,0,30,90);
	private int dx, dy;
	private boolean active;
	
	public Brick(int x, int y)
	{
		this.setSize(new Dimension(31,91));
		this.setLocation(x,y);
		
		dx = x; dy = y;
		active = true;
		setFocusable(false);
	}
	
	public void paintComponent(Graphics g)
	{
		Color blue = new Color(177, 226, 232);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.WHITE);
		g2.fill(brick);
		g2.setColor(blue);
		g2.draw(brick);
	}
	
	public void setDx(int dx)
	{
		this.dx = dx;
	}

	public void setDy(int dy)
	{
		this.dy = dy;
	}
	
//	public int getDy()
//	{
//		return dy;
//	}
//	
//	public int getDx()
//	{
//		return dx;
//	}

	public void kill()
	{
		active = false;
		setVisible(false);
	}
	
	public boolean active()
	{
		return active;
	}
	
	public void updateY()
	{
//		this.setLocation(this.getX(), this.getY() + dy);
	}

	public void updateX()
	{
		
	}
	
	
}
