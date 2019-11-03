package Game;

import java.util.ArrayList;

public class Developer implements Observer{
	private Subject server;
	private ArrayList<Player> players;
	private int banCutOff;

	public Developer(Subject newServer, int newBanCutOff) {
		banCutOff = newBanCutOff;
		server = newServer;
		server.addObserver(this);
		players = new ArrayList<Player>();
	}

	@Override
	public void update(ArrayList<Player> newPlayers) {
		players = newPlayers;
	}

	public ArrayList<Player> playersAfterBan(){
		ArrayList<Player> afterBan = new ArrayList<Player>();
		for(Player p: players){
			if(p.getBehaviorScore() > banCutOff){
				afterBan.add(p);
			}else{
				System.out.println("A player has been banned!");
			}
		}
		return afterBan;
	}
}
