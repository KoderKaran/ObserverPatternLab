package Pacifist;
import Behaviors.FightBehavior;

public class FightPacifist implements FightBehavior{
	@Override
	public boolean fight() {
		//System.out.println("Player is challenged to fight but does not.");
		return false;
	}
}
