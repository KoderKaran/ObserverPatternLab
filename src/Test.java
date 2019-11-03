import Game.Developer;
import Game.Server;
import Game.World;

public class Test {
	public static void main(String[] args) {
		Server server = Server.getInstance();
		Developer karan = new Developer(server, 5000);
		World world= new World(server);
		server.initWorld(100);
		world.action();
	}

}
