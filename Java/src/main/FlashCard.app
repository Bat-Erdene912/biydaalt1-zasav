public class Flashcard {
    private String question;
    private String answer;
    private int mistakeCount;
    private int correctCount;

    public Flashcard(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.mistakeCount = 0;
        this.correctCount = 0;
    }

    public String getQuestion() { return question; }
    public String getAnswer() { return answer; }
    
    public void markCorrect() { correctCount++; }
    public void markIncorrect() { mistakeCount++; }
    
    public int getMistakeCount() { return mistakeCount; }
    public int getCorrectCount() { return correctCount; }
}
