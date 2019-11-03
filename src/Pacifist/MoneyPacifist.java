package Pacifist;
import Behaviors.MoneyBehavior;

public class MoneyPacifist implements MoneyBehavior{
	@Override
	public boolean getMoney() {
		//System.out.println("Player goes to work.");
		return false;
	}
}
