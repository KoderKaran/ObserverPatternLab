import Game.Server;

public class Test {
	public static void main(String[] args) {
		Server serv = Server.getInstance();
		serv.initWorld(100);
	}

}
