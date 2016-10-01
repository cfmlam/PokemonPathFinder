import java.util.ArrayList;

public class Player extends Position{
	private Position current;
	private ArrayList<Pokemon> caught = new ArrayList<Pokemon>();
	private int pokeball;
	private ArrayList<Position> path = new ArrayList<Position>();
	
	Player(Position xy)
	{
		super(xy);
		pokeball=0;
	}
	
	
}
