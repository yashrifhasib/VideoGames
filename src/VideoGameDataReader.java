//Yashrif Hasib Period 8 & 9

import java.io.File;
import java.util.Scanner;

public class VideoGameDataReader {
    //Constants
    private static final String FILENAME = "C:\\Users\\Student 8\\IdeaProjects\\VideoGames\\src\\vgsales.csv";

    public static void main(String[] args) throws Exception {
        File inputFile = new File(FILENAME);
        if (!inputFile.exists())
            System.out.println(FILENAME + " cannot be found.");
        else {
            Scanner input = new Scanner(inputFile);

            int lineCount = 0;
            while (input.hasNextLine()) {
                input.nextLine();
                lineCount++;
            }
            VideoGameDatabase database = new VideoGameDatabase();

            input.close();
            input = new Scanner(inputFile);

            String currentLine;
            String[] elementData;
            VideoGame game;

            int rank, year;
            String genre, publisher, name, platform;
            double JPSales, OtherSales, GlobalSales, NASales, EUSales;

            input.nextLine();
            lineCount = 0;
            while (input.hasNextLine()) {
                currentLine = input.nextLine();
                elementData = currentLine.split(",");
                rank = Integer.parseInt(elementData[0]);
                name = elementData[1];
                platform = elementData[2];
                year = Integer.parseInt(elementData[3]);
                genre = elementData[4];
                publisher = elementData[5];
                NASales = Double.parseDouble(elementData[6]);
                EUSales = Double.parseDouble(elementData[7]);
                JPSales = Double.parseDouble(elementData[8]);
                OtherSales = Double.parseDouble(elementData[9]);
                GlobalSales = Double.parseDouble(elementData[10]);

                game = new VideoGame(rank, name, platform, year, genre, publisher, NASales, EUSales, JPSales, OtherSales, GlobalSales);

                database.setGame(game);
                lineCount++;
            } //end while hasNext
            input.close();

            //System.out.println("Whole VideoGame List: \n" + database);
            //System.out.println("Game 10 \n" + database.getGame(10));
            //System.out.println("Game of platform NES: \n" + database.getPlatform("NES"));
            //System.out.println("Game of Year 2010: \n" + database.getYear(2010));
            //System.out.println("Game of Genre Puzzle: \n" + database.getGenre("Puzzle"));
            //System.out.println("Game of Publisher Nintendo: \n" + database.getPublisher("Nintendo"));
            //database.sortByName();
            //System.out.println("Sorted by Name: \n" + database);
            //database.sortByYear();
            //System.out.println("Sorted by year: \n" + database);
            //System.out.println("Total North America Sales \n" + database.getTotal_NA_Sales());
            //System.out.println("Total North America Sales of NES \n" + database.getTotal_NA_Sales("NES"));
            //System.out.println("Average North America Sales \n" + database.getAverage_NA_Sales());
            //System.out.println("Average North America Sales of NES \n" + database.getAverage_NA_Sales("NES"));
            //System.out.println("Total European Sales \n" + database.getTotal_EU_Sales());
            //System.out.println("Total European Sales of NES \n" + database.getTotal_EU_Sales("NES"));
            //System.out.println("Average European Sales \n" + database.getAverage_EU_Sales());
            //System.out.println("Average European Sales of NES \n" + database.getAverage_EU_Sales("NES"));
            //System.out.println("Total Global Sales \n" + database.getTotal_Global_Sales());
            //System.out.println("Total Global Sales of NES \n" + database.getTotal_Global_Sales("NES"));
            //System.out.println("Average Global Sales \n" + database.getAverage_Global_Sales());
            //System.out.println("Average Global Sales of NES\n" + database.getAverage_Global_Sales("NES"));
        }
    }
}
