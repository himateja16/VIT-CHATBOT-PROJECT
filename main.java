import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Chatbot ===");

        FAQDatabase.loadDefaults(); // load default FAQs

        while (true) {
            System.out.print("\nAsk your question (or type exit): ");
            String question = sc.nextLine();

            if (question.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            String answer = FAQDatabase.getAnswer(question);
            System.out.println("Chatbot: " + answer);
        }

        sc.close();
    }
}
