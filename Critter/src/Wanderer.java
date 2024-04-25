import java.util.Random;

public class Wanderer implements Critter{

	@Override
	public char getChar() {
		// TODO Auto-generated method stub
		return 'W';
	}

	@Override
	public Move getMove(Neighbor front, Neighbor back, Neighbor right, Neighbor left) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		if(front == Neighbor.OTHER) {
			return Move.INFECT;
		}
		else if(front == Neighbor.SAME) {
			int  n = rand.nextInt(2) + 1;
			if(n == 1) {
				return Move.LEFT;
			}
			else {
				return Move.RIGHT;
			}
		}
		else {
			int d = rand.nextInt(4);
			if(d == 0) {
				int g = rand.nextInt(2) + 1;
				if(g == 1) {
					return Move.LEFT;
				}
				else {
					return Move.RIGHT;
				}
			}
			else {
				return Move.HOP;
			}
		}
	}

}
