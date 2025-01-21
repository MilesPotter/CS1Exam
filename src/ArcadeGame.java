public class ArcadeGame {
    public String gameName;
    public int numberOfTokens;
    public boolean isMultiplayer;


    public ArcadeGame(String paramgamename, int paramnumberOfTokens, boolean paramisMultiplayer){
        gameName = paramgamename;
        numberOfTokens = paramnumberOfTokens;
        isMultiplayer = paramisMultiplayer;




    }

    public void printInfo() {
        System.out.println("Name of the Game" + gameName);
        System.out.println("The number of tokens the game costs" + numberOfTokens);
        System.out.println("If the game is multiplayer or not" + isMultiplayer);

    }
} // ms k moved this bracket