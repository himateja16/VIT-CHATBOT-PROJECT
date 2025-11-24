import java.util.ArrayList;

public class FAQDatabase {

    private static ArrayList<FAQItem> faqs = new ArrayList<>();

    public static void loadDefaults() {
        faqs.add(new FAQItem("attendance rule", "Minimum 75% attendance is required."));
        faqs.add(new FAQItem("timetable", "Check your timetable on VTOP."));
        faqs.add(new FAQItem("leave application", "Submit leave through VTOP portal."));
        faqs.add(new FAQItem("dean", "Dean details are available on the university website."));
    }

    public static String getAnswer(String question) {
        String q = question.toLowerCase();

        for (FAQItem item : faqs) {
            if (q.contains(item.question)) {
                return item.answer;
            }
        }

        return "I don't know this yet.";
    }

    public static void addFAQ(String q, String a) {
        faqs.add(new FAQItem(q.toLowerCase(), a));
    }
}
