import java.util.Scanner;

public class AdminPanel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FAQDatabase.loadDefaults();

        System.out.println("=== Admin Panel ===");
        System.out.println("1. Add FAQ");
        System.out.println("2. Exit");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter question: ");
            String q = sc.nextLine();

            System.out.print("Enter answer: ");
            String a = sc.nextLine();

            FAQDatabase.addFAQ(q, a);
            System.out.println("FAQ Added!");
        }

        sc.close();
    }
}
