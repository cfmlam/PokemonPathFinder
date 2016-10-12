import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Game {
	
	public static boolean isInteger(String s, int radix) {		//Function to determine whether a string is number or not
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0 && s.charAt(i) == '-') {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
	}
	
	public void initialize(File inputFile) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		
		// Read the first of the input file
		String line = br.readLine();
		int M = Integer.parseInt(line.split(" ")[0]);
		//int N = Integer.parseInt(line.split(" ")[1]);
		
		// To do: define a map
		Map CurMap= new Map();  //Define CurMap as the new map
		// Read the following M lines of the Map
		for (int i = 0; i < M; i++) {
			line = br.readLine();
			char[] mapChar = line.toCharArray();	//Separate the string into char array
			int mark=0;					// act as column marker
			for(char a:mapChar)			// read each letter in char array
			{
				Position Temp = new Position();		//initialize a position temp variable
				switch(a)							// set the properties of position
				{
					case('#'):
						Temp.setPosition(i, mark, "Wall");
					case(' '):
						Temp.setPosition(i, mark, "Road");
					case('P'):
						Temp.setPosition(i, mark, "Pokemon");
					case('S'):
						Temp.setPosition(i, mark, "Station");
					case('B'):
					{
						Temp.setPosition(i, mark, "Begin");
						CurMap.setStart(i, mark);
					}
					case('D'):
					{
						Temp.setPosition(i, mark, "End");
						CurMap.setEnd(i, mark);
					}
				}
				CurMap.setMap(Temp);		//add to the arraylist in map
				mark++;
			}
			// to do
			// Read the map line by line
		}
		
		// to do
		// Find the number of stations and pokemons in the map 
		// Continue read the information of all the stations and pokemons by using br.readLine();
		
		line=br.readLine();		//read information of station and pokemon 
		String[] StringArray = line.split(", ");
		StringArray[0] = StringArray[0].substring(1, 5);
		String[] PosiArray = StringArray[0].split(",");
		if(isInteger(line,8))	//Station information if true
		{
			Station thisStat = new Station(Integer.parseInt(StringArray[1]));
			thisStat.setPosition(Integer.parseInt(PosiArray[0]), Integer.parseInt(PosiArray[1]));
			CurMap.setStation(thisStat);
		}
		else					//Pokemon information if false
		{
			Pokemon thisPoke = new Pokemon(StringArray[1],StringArray[2],Integer.parseInt(StringArray[3]),Integer.parseInt(StringArray[4]));
			thisPoke.setPosition(Integer.parseInt(PosiArray[0]), Integer.parseInt(PosiArray[1]));
			CurMap.setPoke(thisPoke);
		}
		
		br.close();
	}
	
	public static void main(String[] args) throws Exception{
		File inputFile = new File("./sampleIn.txt");
		File outputFile = new File("./sampleOut.txt");
		
		if (args.length > 0) {
			inputFile = new File(args[0]);
		} 

		if (args.length > 1) {
			outputFile = new File(args[1]);
		}
		
		Game game = new Game();
		game.initialize(inputFile);
		// TO DO 
		// Read the configures of the map and pokemons from the file inputFile
		// and output the results to the file outputFile
		
		
	}
	
	public ArrayList<Position> ValidPath(Game o) 
	{
		ArrayList<Position> resultPath = new ArrayList<Position>();
		
		
		return resultPath;
	}
}

