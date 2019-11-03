package Thief;
import Behaviors.FightBehavior;

public class FightThief implements FightBehavior{
	@Override
	public boolean fight() {
		//steals items as he fights people. The more he steals from a person + how many people in world = more chance of report.
		return true;
	}
}
