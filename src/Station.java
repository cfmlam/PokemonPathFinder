
public class Station extends Position{
	private int conBall;
	
	Station(Position xy, int ball)
	{
		super(xy);
		conBall=ball;
	}
	
	public int getBallCount()
	{
		return conBall;
	}
}
