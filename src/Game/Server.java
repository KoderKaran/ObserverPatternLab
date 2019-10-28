package Game;
import java.util.ArrayList;

public class Server {
	private static Server instance = null;
	private ArrayList<Player> players; 
	private PersonFactory factory;
	private Server() {
		players = new ArrayList<Player>();
		factory = new PersonFactory();
	}
	
	public static Server getInstance() {
		if(instance == null) {
			instance = new Server();
		}
		return instance;
	}
	
	public void initWorld(int popSize) {
		for(int i=0; i<popSize; i++) {
			players.add(factory.newPerson());
		}
	}
}
