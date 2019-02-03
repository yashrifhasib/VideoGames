//Yashrif Hasib Period 8 & 9

public class VideoGame {
    //instance variables
    //All the variables are columns in the Assets/vgsales.csv file.
    String rank;
    String name;
    String platform;
    String year;
    String genre;
    String publisher;
    String NASales; //in millions
    String EUSales; //in millions
    String JPSales; //in millions
    String OtherSales; //in millions
    String GlobalSales; //in millions (addition of all the other sales).

    //constructor
    public VideoGame(String rank, String name, String platform, String year,
                     String genre, String publisher, String NASales, String EUSales,
                     String JPSales, String OtherSales, String GlobalSales) {
        this.rank = rank;
        this.name = name;
        this.platform = platform;
        this.year = year;
        this.genre = genre;
        this.publisher = publisher;
        this.NASales = NASales;
        this.EUSales = EUSales;
        this.JPSales = JPSales;
        this.OtherSales = OtherSales;
        this.GlobalSales = GlobalSales;
    }

    //mutators
    public void setRank(String rank) { this.rank = rank; }
    public void setName(String name) { this.name = name; }
    public void setPlatform(String platform) { this.platform = platform; }
    public void setYear(String year) { this.year = year; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setNASales(String NASales) { this.NASales = NASales; }
    public void setEUSales(String EUSales) { this.EUSales = EUSales; }
    public void setJPSales(String JPSales) { this.JPSales = JPSales; }
    public void setOtherSales(String OtherSales) { this.OtherSales = OtherSales; }
    public void setGlobalSales(String GlobalSales) { this.GlobalSales = GlobalSales; }

    //accessors that return values of instance variables
    public String getRank() { return this.rank; }
    public String getName() { return this.name; }
    public String getPlatform() { return this.platform; }
    public String getYear() { return this.year; }
    public String getGenre() { return this.genre; }
    public String getPublisher() { return this.publisher; }
    public String getNASales() { return this.NASales; }
    public String getEUSales() {return this.EUSales; }
    public String getJPSales() { return this.JPSales; }
    public String getOtherSales() { return this.OtherSales; }
    public String getGlobalSales() { return this.GlobalSales; }

    //toString method to Console print.
    public String toString() {
        String output = "";
        output += rank + ", " + name + ", " + platform + ", " + year + ", " + genre +
                ", " + publisher + ", " + NASales + ", " + EUSales + ", " + JPSales +
                ", " + OtherSales + ", " + GlobalSales + "\n";
        return output;
    }
}