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
        System.out.println("Candidate: " + name);
        System.out.println("Percentage: " + Percentage);
        System.out.println("BackLogs: " + backlogs);
        System.out.println("Graducate year: " + year);

    }
}
