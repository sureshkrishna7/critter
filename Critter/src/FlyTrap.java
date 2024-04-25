
public class FlyTrap implements Critter{

	@Override
	public char getChar() {
		// TODO Auto-generated method stub
		return 'T';
	}

	@Override
	public Move getMove(Neighbor front, Neighbor back, Neighbor right, Neighbor left) {
		// TODO Auto-generated method stub
		if(front == Neighbor.SAME || front == Neighbor.OTHER) {
			return Move.INFECT;
		}
		else {
			return Move.LEFT;
		}
	}

}
