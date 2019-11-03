package Tryhard;
import Behaviors.FightBehavior;

public class FightTryhard implements FightBehavior{
	@Override
	public boolean fight() {
		//will fight fairly but will attempt to do as much dmg as possible
		return false;
	}
}
