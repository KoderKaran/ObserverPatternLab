package Sadists;
import Behaviors.FunBehavior;

public class FunSadist implements FunBehavior{
	@Override
	public boolean haveFun() {
		//Will go around hurting people in non-combat mode for fun.
		//The more ppl they impact + the more people in world = more chance of report
		return true;
	}
}
