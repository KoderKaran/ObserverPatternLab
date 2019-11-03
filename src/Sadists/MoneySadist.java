package Sadists;
import Behaviors.MoneyBehavior;

public class MoneySadist implements MoneyBehavior{
	@Override
	public boolean getMoney() {
		//System.out.println("Player steals money from others.");
		return true;
	}
}
