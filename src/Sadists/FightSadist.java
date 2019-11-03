package Sadists;
import Behaviors.FightBehavior;

public class FightSadist implements FightBehavior{
	@Override
	public boolean fight() {
		//System.out.println("Player cheats and one shot kills everyone they come near.");
		return true;
	}
}
