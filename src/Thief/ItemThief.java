package Thief;
import Behaviors.ItemBehavior;

public class ItemThief implements ItemBehavior{
	@Override
	public boolean getItem() {
		//System.out.println("Player steals items from store illegally.");
		return true;
	}
}
