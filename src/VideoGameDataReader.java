//Yashrif Hasib Period 8 & 9

import java.io.File;
import java.util.Scanner;

public class VideoGameDataReader {
    //Constants
    private static final String FILENAME = "C:\\Users\\Yashrif\\IdeaProjects\\VideoGames\\src\\Assets\\vgsales.csv";

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
            VideoGameDatabase database = new VideoGameDatabase(lineCount);

            input.close();
            input = new Scanner(inputFile);

            String currentLine;
            String[] elementData;
            VideoGame game;

            String rank, year, genre, publisher, name, platform, JPSales, OtherSales, GlobalSales, NASales, EUSales;

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

                database.setGame(lineCount, game);
                lineCount++;
            } //end while hasNext
            input.close();

            //System.out.println(database);
            //System.out.println(database.getPlatform("NES"));
            //System.out.println(database.getYear("2010"));
            //System.out.println(database.getGenre("Puzzle"));
            //System.out.println(database.getPublisher("Konami Digital Entertainment"));
            System.out.println(database.sortByName());
        }
    }
}
