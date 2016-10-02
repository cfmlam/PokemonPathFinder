
public class Pokemon extends Position{
	private String name;
	private String type;
	private int combat_power;
	private int required_balls;
	
	Pokemon(Position xy){
		super(xy);
	}
	
	Pokemon(String name, String type, int cp, int rb)
	{
		this.name=name;
		this.type=type;
		combat_power=cp;
		required_balls=rb;
	}
	
	public void setPosition(int x, int y)
	{
		this.setPosition(x, y, "Pokemon");
	}
}
