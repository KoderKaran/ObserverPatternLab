package Thief;
import Behaviors.FightBehavior;

public class FightThief implements FightBehavior{
	@Override
	public boolean fight() {
		//System.out.println("Player illegally takes items from others while fighting them.");
		return true;
	}
}
