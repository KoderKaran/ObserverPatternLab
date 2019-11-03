package Sadists;
import Behaviors.MoneyBehavior;

public class MoneySadist implements MoneyBehavior{
	@Override
	public boolean getMoney() {
		//make him steal money from players. The more he does it + the more people in world = more likely report
		return true;
	}
}
