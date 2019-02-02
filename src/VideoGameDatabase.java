public class VideoGameDatabase {
    //instance variables
    VideoGame[] database;

    //constructors
    public VideoGameDatabase(int numberOfVideoGames) {
        this.database = new VideoGame[numberOfVideoGames];
    }

    public void setGame(int index, VideoGame game) {
        database[index] = game;
    }

    public String toString() {
        String output = "";
        for (VideoGame videoGame : database)
            output += videoGame;
        return output;
    }
}
