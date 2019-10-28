package Game;

public interface Subject {
	void addObserver(Observer o);
	void delObserver(Observer o);
	void notifyObserver();
}
