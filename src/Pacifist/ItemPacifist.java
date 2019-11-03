package Pacifist;
import Behaviors.ItemBehavior;

public class ItemPacifist implements ItemBehavior{
	@Override
	public boolean getItem() {
		//System.out.println("Player buys an item for the listed price.");
		return false;
	}
}
