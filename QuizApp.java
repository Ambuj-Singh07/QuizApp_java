import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();

        // Add quiz questions
        questions.add(new Question(
            "What is the capital of India?",
            new String[]{"Mumbai", "Delhi", "Kolkata", "Chennai"},
            1 // Delhi (index 1)
        ));

        questions.add(new Question(
            "Which language is used for Android development?",
            new String[]{"Python", "Kotlin", "Swift", "Ruby"},
            1 // Kotlin
        ));

        questions.add(new Question(
            "Who is the founder of Microsoft?",
            new String[]{"Elon Musk", "Steve Jobs", "Bill Gates", "Larry Page"},
            2 // Bill Gates
        ));

        int score = 0;

        System.out.println("🎓 Welcome to the Online Quiz App!\n");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Q" + (i + 1) + ":");
            q.displayQuestion();
            System.out.print("Your answer (1-4): ");
            int userAnswer = sc.nextInt();

            if (q.isCorrect(userAnswer)) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong!\n");
            }
        }

        System.out.println("🎉 Quiz Finished!");
        System.out.println("You scored: " + score + " out of " + questions.size());

        sc.close();
    }
}
