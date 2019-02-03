//Yashrif Hasib Period 8 & 9

import java.util.ArrayList;
import java.util.List;

public class VideoGameDatabase {
    //instance variables
    VideoGame[] database;

    //constructors
    public VideoGameDatabase(int numberOfVideoGames) {
        this.database = new VideoGame[numberOfVideoGames];
    }

    //mutators
    public void setGame(int index, VideoGame game) {
        database[index] = game;
    }

    /**
     * A method to filter out the given platform games.
     * @param platform The given platform (user has to give)
     * @return A video game database with all the games of the given platform
     */
    public VideoGameDatabase getPlatform(String platform) {
        List<VideoGame> games = new ArrayList<VideoGame>();
        for (VideoGame game : database) {
            if (game.getPlatform().equals(platform))
                games.add(game);
        }
        VideoGameDatabase output = new VideoGameDatabase(games.size());
        for (int i = 0; i < games.size(); i++) {
            output.setGame(i, games.get(i));
        }
        return output;
    }

    /**
     * A method to filter out the given year of games.
     * @param year The given year (user has to give)
     * @return The video games of the given year only
     */
    public VideoGameDatabase getYear(String year) {
        List<VideoGame> games = new ArrayList<VideoGame>();
        for (VideoGame game : database) {
            if (game.getYear().equals(year))
                games.add(game);
        }
        VideoGameDatabase output = new VideoGameDatabase(games.size());
        for (int i = 0; i < games.size(); i++) {
            output.setGame(i, games.get(i));
        }
        return output;
    }

    /**
     * A method to filter out the given genre of games.
     * @param genre The given genre(user has to give)
     * @return The video games of the given genre only
     */
    public VideoGameDatabase getGenre(String genre) {
        List<VideoGame> games = new ArrayList<VideoGame>();
        for (VideoGame game : database) {
            if (game.getGenre().equals(genre))
                games.add(game);
        }
        VideoGameDatabase output = new VideoGameDatabase(games.size());
        for (int i = 0; i < games.size(); i++) {
            output.setGame(i, games.get(i));
        }
        return output;
    }

    /**
     * A method to filter out the given publisher of games.
     * @param publisher The given publisher(user has to give)
     * @return The video games of the given publisher only
     */
    public VideoGameDatabase getPublisher(String publisher) {
        List<VideoGame> games = new ArrayList<VideoGame>();
        for (VideoGame game : database) {
            if (game.getPublisher().equals(publisher))
                games.add(game);
        }
        VideoGameDatabase output = new VideoGameDatabase(games.size());
        for (int i = 0; i < games.size(); i++) {
            output.setGame(i, games.get(i));
        }
        return output;
    }

    public VideoGameDatabase sortByName() {
        for (int i = 0; i < this.database.length - 1; i++) {
            int lowPosition = i;
            for (int j = i + 1; j < this.database.length; j++) {
                if (database[j].getName().split("")[0].compareTo(database[i].getName().split("")[0]) < 0)
                    lowPosition = j;
            }
            swap(lowPosition, i, database);
        }
        VideoGameDatabase output = new VideoGameDatabase(database.length);
        for (int i = 0; i < database.length; i++) {
            output.setGame(i, database[i]);
        }
        return output;
    }

    private void swap(int firstIndex, int secondIndex, VideoGame[] database) {
        VideoGame temp = database[firstIndex];
        database[firstIndex] = database[secondIndex];
        database[secondIndex] = temp;
    }

    //toString Method to console print Video Games
    public String toString() {
        String output = "";
        for (VideoGame game : database)
            output += game;
        return output;
    }
}