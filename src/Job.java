public class Job {
    private String company;
    private String role;
    private double minPer;
    private int maxBacklog;
    private int reqYear;

    public Job(String company, String role, double minPer, int maxBacklog, int reqYear) {
        this.company = company;
        this.role = role;
        this.minPer = minPer;
        this.maxBacklog = maxBacklog;
        this.reqYear = reqYear;
    }// geters

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public double getMinPer() {
        return minPer;
    }

    public int getMaxBacklog() {
        return maxBacklog;
    }

    public int getReqYear() {
        return reqYear;
    }

}
