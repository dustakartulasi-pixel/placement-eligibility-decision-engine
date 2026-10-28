import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student Name: ");
        String name = sc.next();
        System.out.print("Enter the Percentage: ");
        double Percentage = sc.nextDouble();
        System.out.print("Enter number of backlogs: ");
        int backlogs = sc.nextInt();
        System.out.print("Enter Graducate year: ");
        int year = sc.nextInt();
        Candidate canobj = new Candidate(name, Percentage, backlogs, year);

        System.out.println("Candidate:  " + canobj.getName());
        System.out.println("Percentage:  " + canobj.getPercentage());
        System.out.println("BackLogs:  " + canobj.getBacklogs());
        System.out.println("Graducate year:  " + canobj.getYear());

    }
}
