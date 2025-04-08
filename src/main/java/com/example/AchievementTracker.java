import java.util.*;

public class AchievementTracker {
    private int correctAnswers = 0;
    private int repeatedAnswers = 0;
    private Map<String, Integer> correctStreak = new HashMap<>();

    public void trackAnswer(String question, boolean isCorrect) {
        if (isCorrect) {
            correctAnswers++;
            correctStreak.put(question, correctStreak.getOrDefault(question, 0) + 1);
        } else {
            correctStreak.put(question, 0);
        }
    }

    public void trackRepetition() {
        repeatedAnswers++;
    }

    public void printAchievements() {
        System.out.println("Амжилтууд:");
        if (correctAnswers == correctStreak.size()) {
            System.out.println("🏆 CORRECT: Бүх картыг зөв хариуллаа!");
        }
        if (repeatedAnswers > 5) {
            System.out.println("🏆 REPEAT: Нэг картыг 5-аас олон удаа хариуллаа!");
        }
        for (int count : correctStreak.values()) {
            if (count >= 3) {
                System.out.println("🏆 CONFIDENT: Нэг картыг дор хаяж 3 удаа зөв хариуллаа!");
                break;
            }
        }
    }
}
