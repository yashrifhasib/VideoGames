//Yashrif Hasib Period 8 & 9

public class VideoGame {
    //instance variables
    //All the variables are columns in the Assets/vgsales.csv file.
    int rank;
    String name;
    String platform;
    int year;
    String genre;
    String publisher;
    double NASales; //in millions
    double EUSales; //in millions
    double JPSales; //in millions
    double OtherSales; //in millions
    double GlobalSales; //in millions (addition of all the other sales).

    //constructor
    public VideoGame(int rank, String name, String platform, int year,
                     String genre, String publisher, double NASales, double EUSales,
                     double JPSales, double OtherSales, double GlobalSales) {
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
    public void setNASales(double NASales) { this.NASales = NASales; }
    public void setEUSales(double EUSales) { this.EUSales = EUSales; }
    public void setJPSales(double JPSales) { this.JPSales = JPSales; }
    public void setOtherSales(double OtherSales) { this.OtherSales = OtherSales; }
    public void setGlobalSales(double GlobalSales) { this.GlobalSales = GlobalSales; }

    //accessors that return values of instance variables
    public int getRank() { return this.rank; }
    public String getName() { return this.name; }
    public String getPlatform() { return this.platform; }
    public int getYear() { return this.year; }
    public String getGenre() { return this.genre; }
    public String getPublisher() { return this.publisher; }
    public double getNASales() { return this.NASales; }
    public double getEUSales() {return this.EUSales; }
    public double getJPSales() { return this.JPSales; }
    public double getOtherSales() { return this.OtherSales; }
    public double getGlobalSales() { return this.GlobalSales; }

    //toString method to Console print.
    public String toString() {
        String output = "";
        output += rank + ", " + name + ", " + platform + ", " + year + ", " + genre +
                ", " + publisher + ", " + NASales + ", " + EUSales + ", " + JPSales +
                ", " + OtherSales + ", " + GlobalSales + "\n";
        return output;
    }
}
