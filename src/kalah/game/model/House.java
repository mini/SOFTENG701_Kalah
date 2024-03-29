package kalah.game.model;

public class House extends Pit {

	public House(int owner, int startingSeeds, int index) {
		super(owner, index);
		numSeeds = startingSeeds;
	}

	/**
	 * Removes all seeds from the House
	 * @return how many seeds there were
	 */
	public int takeAllSeeds() {
		int seeds = numSeeds;
		numSeeds = 0;
		return seeds;
	}
	
	@Override
	public String toString() {
		return String.format("House [seeds=%s, owner=%s, index=%s]", numSeeds, ownerNum, index);
	}
}
