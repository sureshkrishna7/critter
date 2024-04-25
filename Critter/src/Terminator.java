
public class Terminator implements Critter{
	
	@Override
	public char getChar() {
		// TODO Auto-generated method stub
		return 'X';
	}

	@Override
	public Move getMove(Neighbor front, Neighbor back, Neighbor right, Neighbor left) {
		// TODO Auto-generated method stub
		if (front == Neighbor.EMPTY)
			return Move.HOP;
		else if (front == Neighbor.OTHER || back == Neighbor.OTHER || right == Neighbor.OTHER || left == Neighbor.OTHER)
			return Move.INFECT;
		else {
			if (Math.random() > 0.5) // 50% chance of turning left. 0.3, means a 70% chance
				return Move.LEFT;
			else
				return Move.RIGHT;
		}
	}
}
