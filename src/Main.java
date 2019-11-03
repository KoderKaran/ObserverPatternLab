import Game.*;

import java.util.ArrayList;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Server server = Server.getInstance();
		Developer karan = new Developer(server, 5000);
		World world= new World(server);
		PersonFactory factory = new PersonFactory(server);
		Random rand = new Random();
		server.initWorld(100);
		int count = 0;
		while(true){
			world.action();
			ArrayList<Player> afterBan = karan.playersAfterBan();
			if(server.getPlayers().size() != afterBan.size()){
				count = 0;
				int diff = server.getPlayers().size() - karan.playersAfterBan().size();
				if(diff>0){
					System.out.println(diff + " player(s) have been banned! There are " + afterBan.size() + " players left!");
				}
				server.setPlayers(afterBan);
			}else{
				count++;
			}
			if(server.getPlayers().size() == 1){
				System.out.println("There is only one player left!!");
				break;
			}
			if(count>=20){
				System.out.println("There are only good players left! The ending population was " + server.getPlayers().size());
				break;
			}
		}

	}

}
