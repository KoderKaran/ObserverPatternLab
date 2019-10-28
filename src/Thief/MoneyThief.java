package Thief;
import Behaviors.MoneyBehavior;

public class MoneyThief implements MoneyBehavior{
	@Override
	public void getMoney() {
		//sells stuff he stole from others. More people in world + more stuff sold = higher report chance
	}
}
