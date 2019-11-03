package Game;
import Pacifist.*;
import Sadists.*;
import Thief.*;
import Tryhard.*;
import Behaviors.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PersonFactory {
	private ArrayList<FightBehavior> fightBehaviors = new ArrayList<FightBehavior>(Arrays.asList(
			new FightPacifist(), new FightSadist(), new FightThief(), new FightTryhard()));
	
	private ArrayList<FunBehavior> funBehaviors = new ArrayList<FunBehavior>(Arrays.asList(
			new FunPacifist(), new FunSadist(), new FunThief(), new FunTryhard()));
	
	private ArrayList<ItemBehavior> itemBehaviors = new ArrayList<ItemBehavior>(Arrays.asList(
			new ItemPacifist(), new ItemSadist(), new ItemThief(), new ItemTryhard()));
	
	private ArrayList<MoneyBehavior> moneyBehaviors = new ArrayList<MoneyBehavior>(Arrays.asList(
			new MoneyPacifist(), new MoneySadist(), new MoneyThief(), new MoneyTryhard()));
	
	private Random rand;
	private Subject server;
	
	public PersonFactory(Subject newServer) {
		server = newServer;
		rand = new Random();
	}
	
	public Player newPerson() {
		int fightRand = rand.nextInt(fightBehaviors.size());
		int funRand = rand.nextInt(funBehaviors.size());
		int itemRand = rand.nextInt(itemBehaviors.size());
		int moneyRand = rand.nextInt(moneyBehaviors.size());
		
		FightBehavior fight = fightBehaviors.get(fightRand);
		FunBehavior fun = funBehaviors.get(funRand);
		ItemBehavior item = itemBehaviors.get(itemRand);
		MoneyBehavior money = moneyBehaviors.get(moneyRand);
		
		return new Player(fight, fun, item, money, server);
		
	}
	
}
