
public class LandMine implements Critter{

	@Override
	public char getChar() {
		// TODO Auto-generated method stub
		return 'L';
	}

	@Override
	public Move getMove(Neighbor front, Neighbor back, Neighbor right, Neighbor left) {
		// TODO Auto-generated method stub
		if (front == Neighbor.WALL) {
			return Move.LEFT;
		}
		else {
			return Move.INFECT;
		}
	}

}
