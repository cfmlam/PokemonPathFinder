
public class Station extends Position{
	private int conBall;
	
	Station(Position xy, int ball)
	{
		super(xy);
		conBall=ball;
	}
	
	Station(int ball)
	{
		conBall=ball;
	}
	
	public void setPosition(int x, int y)
	{
		this.setPosition(x, y, "Station");
	}
	
	public int getBallCount()
	{
		return conBall;
	}
}
