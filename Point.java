package pi;
import java.lang.Math;

public class Point {
	
	private double x;
	private double y;
	
	public Point()
	{
		this.x = Math.random() - .5;
		this.y = Math.random() - .5;
	}
	
	public Point (double min, double max)
	{
		this.x = (Math.random() * (max - min)) + min;
		this.y = (Math.random() * (max - min)) + min;
	}

	public double getX() 
	{
		return x;
	}

	public double getY() 
	{
		return y;
	}
	public String toString()
	{
		return "(" + this.x + ", " + this.y + ")";
	}

}
