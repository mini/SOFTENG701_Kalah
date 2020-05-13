package kalah.ui.format.theme;

public interface GridTheme {

	public int getStoreCellWidth();
	
	public int getHouseCellWidth();
	
	public String getSpacer();
	
	public String getVBorder();

	public String getHBorder();

	public String getCorner();

	public String getHouseCellContent(int houseNum, int numSeeds);

	public String getPlayerLabel(int playerNum);

	public String getSeedCount(int numSeeds);
}