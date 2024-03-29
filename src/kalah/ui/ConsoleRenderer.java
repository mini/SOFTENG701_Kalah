package kalah.ui;

import kalah.game.model.Board;

public interface ConsoleRenderer {
	
	/**
	 * Renders the board as a String, lines should be split up. 
	 */
	public String[] getBoardRepresentation(Board board);

	public String getPlayerInputPrompt(int playerNum, String cancelToken);

	public String getEmptyHouseMsg();

	public String getScoreMsg(int playerNum, int score);

	public String getWinMsg(int playerNum);

	public String getTieMsg();

	public String getGameOverMsg();
}
