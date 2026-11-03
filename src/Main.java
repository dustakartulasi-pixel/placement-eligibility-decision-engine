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
        Job jobobj = new Job("Amazan", "Software Developer", 65, 0, 2026);

        EligibilityRule[] rules = { new PercentageRule(), new BacklogRule(), new GraduationYearRule() };

        boolean percentagePass = percentageRule.check(canobj, jobobj);
        boolean backlogPass = backlogRule.check(canobj, jobobj);
        boolean yearPass = yearRule.check(canobj, jobobj);
        boolean eligible = percentagePass && backlogPass && yearPass;

        System.out.println("---------------------------------");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("Candidate: " + canobj.getName());
        System.out.println("Company: " + jobobj.getCompany());
        System.out.println("Role: " + jobobj.getRole());
        System.out.println();

        if (percentagePass) {
            System.out.println("Percentage: PASS");
        } else {
            System.out.println("Percentage: FAIL");
        }

        if (backlogPass) {
            System.out.println("Backlogs: PASS");
        } else {
            System.out.println("Backlogs: FAIL");
        }

        if (yearPass) {
            System.out.println("Graduation Year: PASS");
        } else {
            System.out.println("Graduation Year: FAIL");
        }

        System.out.println();
        if (eligible) {
            System.out.println("Final Result: ELIGIBLE");
        } else {
            System.out.println("Final Result: NOT ELIGIBLE");
        }
    }
}
