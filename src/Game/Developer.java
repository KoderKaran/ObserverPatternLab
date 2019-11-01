package Game;

import java.util.ArrayList;

public class Developer implements Observer{
	private Subject server;
	private ArrayList<Player> players;

	public Developer(Subject newServer) {
		server = newServer;
		server.addObserver(this);
		players = new ArrayList<Player>();
	}

	@Override
	public void update(ArrayList<Player> newPlayers) {
		players = newPlayers;
	}
}
