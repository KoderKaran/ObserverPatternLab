package Thief;
import Behaviors.ItemBehavior;

public class ItemThief implements ItemBehavior{
	@Override
	public boolean getItem() {
		//have thief steal items from the stores. More people in world = more chance of report
		return true;
	}
}
