import java.util.ArrayList;

public class Map{
	private ArrayList<Position> mapArray = new ArrayList<Position>();
	private ArrayList<Pokemon> PokeArray = new ArrayList<Pokemon>();
	private ArrayList<Station> StationArray = new ArrayList<Station>();
	
	
	public void setMap(int row, int column, String type)
	{
		Position cell = new Position(row, column, type);
		mapArray.add(cell);
	}
	
	public void setMap(Position q)
	{
		mapArray.add(q);
	}
	
	public void setPoke(Pokemon q)
	{
		PokeArray.add(q);
	}
	
	public void setStation(Station q)
	{
		StationArray.add(q);
	}
}
