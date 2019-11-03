package Thief;
import Behaviors.MoneyBehavior;

public class MoneyThief implements MoneyBehavior{
	@Override
	public boolean getMoney() {
		//System.out.println("Player sells stuff he stole from others.");
		return true;
	}
}
