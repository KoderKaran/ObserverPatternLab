package Thief;
import Behaviors.FunBehavior;

public class FunThief implements FunBehavior{
	@Override
	public boolean haveFun() {
		//goes around and parades the items he has stolen, bragging that he cheated for them. More people + more valuable items = more likely reported
		return true;
	}
}
