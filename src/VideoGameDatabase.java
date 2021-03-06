//Yashrif Hasib Period 8 & 9

import java.util.ArrayList;
import java.util.List;

public class VideoGameDatabase {
    //instance variables
    ArrayList<VideoGame> database;

    //constructors
    public VideoGameDatabase() {
        this.database = new ArrayList<>();
    }

    //mutators
    public void setGame(VideoGame game) {
        database.add(game);
    }

    /**
     * Return the video game of the given rank
     * @param rank the given rank
     * @return the video game
     */
    public VideoGame getGame(int rank) {
        for (VideoGame game : database)
            if (game.getRank() == rank)
                return game;
        return null;
    }

    /**
     * A method to filter out the given platform games.
     * @param platform The given platform (user has to give)
     * @return A video game database with all the games of the given platform
     */
    public VideoGameDatabase getPlatform(String platform) {
        VideoGameDatabase games = new VideoGameDatabase();
        for (VideoGame game : database) {
            if (game.getPlatform().equals(platform))
                games.setGame(game);
        }
        return games;
    }

    /**
     * A method to filter out the given year of games.
     * @param year The given year (user has to give)
     * @return The video games of the given year only
     */
    public VideoGameDatabase getYear(int year) {
        VideoGameDatabase games = new VideoGameDatabase();
        for (VideoGame game : database) {
            if (game.getYear() == year)
                games.setGame(game);
        }
        return games;
    }

    /**
     * A method to filter out the given genre of games.
     * @param genre The given genre(user has to give)
     * @return The video games of the given genre only
     */
    public VideoGameDatabase getGenre(String genre) {
        VideoGameDatabase games = new VideoGameDatabase();
        for (VideoGame game : database) {
            if (game.getGenre().equals(genre))
                games.setGame(game);
        }
        return games;
    }

    /**
     * A method to filter out the given publisher of games.
     * @param publisher The given publisher(user has to give)
     * @return The video games of the given publisher only
     */
    public VideoGameDatabase getPublisher(String publisher) {
        VideoGameDatabase games = new VideoGameDatabase();
        for (VideoGame game : database) {
            if (game.getPublisher().equals(publisher))
                games.setGame(game);
        }
        return games;
    }

    /**
     * A method that sorts by the name of the game
     * @return A VideoGameDatabase all sorted out.
     */
    public void sortByName() {
        for (int i = 0; i < this.database.size() - 1; i++) {
            int lowPosition = i;
            for (int j = i + 1; j < this.database.size(); j++) {
                if (database.get(j).getName().compareTo(database.get(i).getName()) < 0)
                    lowPosition = j;
            }
            swap(lowPosition, i, database);
        }

        return adder(database);
    }

    /**
     * A method that sorts by the year of release of the game
     * @return A VideoGameDatabase Object all sorted according to year.
     */
    public void sortByYear() {
        for (int i = 0; i < this.database.size() - 1; i++) {
            int lowPosition = i;
            for (int j = i + 1; j < this.database.size(); j++) {
                if (database.get(j).getYear() < database.get(i).getYear())
                    lowPosition = j;
            }
            swap(lowPosition, i, database);
        }
        return adder(database);
    }

    /**
     * Total North America Sales of all games
     * @return The Total
     */
    public double getTotal_NA_Sales() {
        double sum = 0;
        for (VideoGame game : database)
            sum += game.getNASales();
        return sum;
    }

    /**
     * Average North America Sales
     * @return The Average
     */
    public double getAverage_NA_Sales() {
        double sum = 0;
        int count = 0;
        for (VideoGame game : database) {
            sum += game.getNASales();
            count++;
        }
        return sum / count;
    }

    /**
     * Total North America Sales of the given Platform
     * @param platform the given platform
     * @return the sales
     */
    public double getTotal_NA_Sales(String platform) {
        double sum = 0;
        for (VideoGame game : database)
            if (game.getPlatform().equals(platform))
                sum += game.getNASales();
        return sum;
    }

    /**
     * Average North America Sales of the given platform
     * @param platform the given platform
     * @return the average sales
     */
    public double getAverage_NA_Sales(String platform) {
        double sum = 0;
        int count = 0;
        for (VideoGame game : database) {
            if (game.getPlatform().equals(platform))
                sum += game.getNASales();
            count++;
        }
        return sum / count;
    }

    /**
     * Total Europe Sales of all games
     * @return The Total
     */
    public double getTotal_EU_Sales() {
        double sum = 0;
        for (VideoGame game : database)
            sum += game.getEUSales();
        return sum;
    }

    /**
     * Average Europe Sales
     * @return The Average
     */
    public double getAverage_EU_Sales() {
        double sum = 0;
        int count = 0;
        for (VideoGame game : database) {
            sum += game.getEUSales();
            count++;
        }
        return sum / count;
    }

    /**
     * Total Europe Sales of the given Platform
     * @param platform the given platform
     * @return the sales
     */
    public double getTotal_EU_Sales(String platform) {
        double sum = 0;
        for (VideoGame game : database)
            if (game.getPlatform().equals(platform))
                sum += game.getEUSales();
        return sum;
    }

    /**
     * Average Europe Sales of the given platform
     * @param platform the given platform
     * @return the average sales
     */
    public double getAverage_EU_Sales(String platform) {
        double sum = 0;
        int count = 0;
        for (VideoGame game : database) {
            if (game.getPlatform().equals(platform))
                sum += game.getEUSales();
            count++;
        }
        return sum / count;
    }

    /**
     * Total Global Sales of all games
     * @return The Total
     */
    public double getTotal_Global_Sales() {
        double sum = 0;
        for (VideoGame game : database)
            sum += game.getGlobalSales();
        return sum;
    }

    /**
     * Average Global Sales
     * @return The Average
     */
    public double getAverage_Global_Sales() {
        double sum = 0;
        int count = 0;
        for (VideoGame game : database) {
            sum += game.getGlobalSales();
            count++;
        }
        return sum / count;
    }

    /**
     * Total Global Sales of the given Platform
     * @param platform the given platform
     * @return the sales
     */
    public double getTotal_Global_Sales(String platform) {
        double sum = 0;
        for (VideoGame game : database)
            if (game.getPlatform().equals(platform))
                sum += game.getGlobalSales();
        return sum;
    }

    /**
     * Average Global Sales of the given platform
     * @param platform the given platform
     * @return the average sales
     */
    public double getAverage_Global_Sales(String platform) {
        double sum = 0;
        int count = 0;
        for (VideoGame game : database) {
            if (game.getPlatform().equals(platform))
                sum += game.getGlobalSales();
            count++;
        }
        return sum / count;
    }

    /**
     * A toString() method
     * @return A string to represent the object
     */
    public String toString() {
        String output = "";
        for (VideoGame game : database)
            output += game;
        return output;
    }


    /**
     * A helper method to swap 2 elements in an ArrayList.
     * @param firstIndex The first element
     * @param secondIndex The second element
     * @param database The ArrayList to be changed
     */
    private void swap(int firstIndex, int secondIndex, ArrayList<VideoGame> database) {
        VideoGame temp = database.get(firstIndex);
        database.set(firstIndex, database.get(secondIndex));
        database.set(secondIndex, temp);
    }

    /**
     * A method that will convert an arraylist into a VideoGameDatabase
     * @param database the arraylist
     * @return the VideoGameDatabase
     */
    private VideoGameDatabase adder(ArrayList<VideoGame> database) {
        VideoGameDatabase output = new VideoGameDatabase();
        for (int i = 0; i < database.size(); i++)
            output.setGame(database.get(i));
        return output;
    }
}
