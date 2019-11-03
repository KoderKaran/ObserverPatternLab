package Sadists;
import Behaviors.FightBehavior;

public class FightSadist implements FightBehavior{
	@Override
	public boolean fight() {
		//one shot KOs. The more people in world = more chance of reports
		return true;
	}
}
