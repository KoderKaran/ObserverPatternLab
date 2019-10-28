package Game;
import Behaviors.*;

public class Player {
	private FightBehavior fight;
	private FunBehavior fun;
	private ItemBehavior item;
	private MoneyBehavior money;
	
	public Player(FightBehavior newFight, FunBehavior newFun, ItemBehavior newItem, MoneyBehavior newMoney) {
		fight = newFight;
		fun = newFun;
		item = newItem;
		money = newMoney;
	}
}
