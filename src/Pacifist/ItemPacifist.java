package Pacifist;
import Behaviors.ItemBehavior;

public class ItemPacifist implements ItemBehavior{
	@Override
	public boolean getItem() {
		//buys items at listed price and sometimes will buy something for someone else in shop
		return false;
	}
}
