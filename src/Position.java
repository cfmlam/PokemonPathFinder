
public class Position {
	private int x;
	private int y;
	private String type;
	
	Position()
	{
		
	}
	
	Position(int x, int y, String type)
	{
		this.x=x;
		this.y=y;
		this.type=type;
	}
	
	Position(Position q)
	{
		x=q.x;
		y=q.y;
		type=q.type;
	}
	
	public void setPosition(int x, int y, String type)
	{
		this.x=x;
		this.y=y;
		this.type=type;
	}
	
	public String getType()
	{
		return type;
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
