import java.util.ArrayList;

public class Map{
	private ArrayList<Position> mapArray = new ArrayList<Position>();
	
	public void setMap(int row, int column, String type)
	{
		Position cell = new Position(row, column, type);
		mapArray.add(cell);
	}
	
	public void setMap(Position q)
	{
		mapArray.add(q);
	}
}
