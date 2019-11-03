package Sadists;
import Behaviors.FunBehavior;

public class FunSadist implements FunBehavior{
	@Override
	public boolean haveFun() {
		//System.out.println("Player goes around hurting everyone they cross even if not in combat mode.");
		return true;
	}
}
