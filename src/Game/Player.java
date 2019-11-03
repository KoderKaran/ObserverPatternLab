package Game;
import Behaviors.*;

import java.util.ArrayList;
import java.util.Random;

public class Player implements Observer{
	private FightBehavior fight;
	private FunBehavior fun;
	private ItemBehavior item;
	private MoneyBehavior money;
	private Random rand;
	private Subject server;
	private int playerCount;
	private int behaviorScore;
	
	public Player(FightBehavior newFight, FunBehavior newFun, ItemBehavior newItem, MoneyBehavior newMoney, Subject newServer) {
		server = newServer;
		server.addObserver(this);
		behaviorScore = 10000;
		fight = newFight;
		fun = newFun;
		item = newItem;
		money = newMoney;
		rand = new Random();
	}

	public void reportHandler(){
		for(int i=0; i < playerCount; i++){
			double reportCheck = rand.nextDouble();
			if(reportCheck < .15){
				this.behaviorScore -= 500;
			}
		}
	}

	public void commendHandler(){
		for(int i=0; i < playerCount; i++){
			double commendCheck = rand.nextDouble();
			if(commendCheck < .05){
				this.behaviorScore += 500;
			}
		}
		if(this.behaviorScore > 10000){
			this.behaviorScore = 10000;
		}
	}

	public void randomAction(){
		int actionCheck = rand.nextInt(4);
		boolean reportable;
		if(actionCheck == 0){
			reportable = fight.fight();
		}else if(actionCheck == 1){
			reportable = fun.haveFun();
		}else if(actionCheck == 2){
			reportable = item.getItem();
		}else{
			reportable = money.getMoney();
		}
		if(reportable){
			this.reportHandler();
		}else{
			this.commendHandler();
		}
	}

	public int getBehaviorScore() {
		return behaviorScore;
	}

	public void setBehavior_score(int newBehaviorScore) {
		this.behaviorScore = newBehaviorScore;
	}

	@Override
	public void update(ArrayList<Player> newPlayers) {
		playerCount = newPlayers.size();
	}
}
