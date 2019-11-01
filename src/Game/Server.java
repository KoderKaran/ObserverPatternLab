package Game;
import java.util.ArrayList;

public class Server implements Subject{
	private static Server instance = null;
	private ArrayList<Player> players;
	private ArrayList<Observer> observers;
	private PersonFactory factory;

	private Server() {
		players = new ArrayList<Player>();
		factory = new PersonFactory();
		observers = new ArrayList<Observer>();
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

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void delObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index >= 0){
			observers.remove(index);
		}
	}

	@Override
	public void notifyObserver() {
		for(Observer o: observers){
			o.update(players);
		}
	}
}
