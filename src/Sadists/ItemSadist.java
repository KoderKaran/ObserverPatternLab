package Sadists;
import Behaviors.ItemBehavior;

public class ItemSadist implements ItemBehavior{
	@Override
	public boolean getItem() {
		//System.out.println("Player resets items prices in all shops to 999999 gold.");
		return true;
	}
}
