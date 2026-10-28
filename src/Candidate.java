public class Candidate {
    private String name;
    private double Percentage;
    private int backlogs;
    private int year;

    public Candidate(String name, double Percentage, int backlogs, int year) {
        this.name = name;
        this.Percentage = Percentage;
        this.backlogs = backlogs;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return Percentage;
    }

    public int getBacklogs() {
        return backlogs;
    }

    public int getYear() {
        return year;
    }

}
