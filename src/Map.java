import java.util.ArrayList;

public class Map{
	private ArrayList<Position> mapArray = new ArrayList<Position>();
	private ArrayList<Pokemon> PokeArray = new ArrayList<Pokemon>();
	private ArrayList<Station> StationArray = new ArrayList<Station>();
	private Position Start;
	private Position End;
	private ArrayList<Position> PathArray= new ArrayList<Position>();
	
	public void setMap(int row, int column, String type)
	{
		Position cell = new Position(row, column, type);
		mapArray.add(cell);
	}
	
	public boolean pathFinder(int x, int y)
	{
		Position q = new Position(x,y);
		if(q==End)
			return true;
		else if(mapArray.contains(q)!=true) 
			return false;
		
		PathArray.add(q);
		if(pathFinder(q.getX(), q.getY()-1) == true) return true;
		if(pathFinder(q.getX()-1, q.getY()) == true) return true;
		if(pathFinder(q.getX()+1, q.getY()) == true) return true;
		if(pathFinder(q.getX(), q.getY()) == true) return true;
		PathArray.remove(q);
		
		return false;
	}
	
	public void setStart(int x, int y)
	{
		Start = new Position(x,y,"Begin");
	}
	
	public void setEnd(int x, int y)
	{
		End = new Position(x,y,"End");
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
