
public class Position {
	private int x;
	private int y;
	
	Position(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	Position(Position q)
	{
		x=q.x;
		y=q.y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
}
