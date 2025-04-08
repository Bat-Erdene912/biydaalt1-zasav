import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlashcardTest {
    private Flashcard flashcard;

    @BeforeEach
    public void setUp() {
        flashcard = new Flashcard("What is Java?", "A programming language");
    }

    @Test
    public void testMarkCorrect() {
        flashcard.markCorrect();
        assertEquals(1, flashcard.getCorrectCount());
    }

    @Test
    public void testMarkIncorrect() {
        flashcard.markIncorrect();
        assertEquals(1, flashcard.getMistakeCount());
    }

    @Test
    public void testGetQuestion() {
        assertEquals("What is Java?", flashcard.getQuestion());
    }

    @Test
    public void testGetAnswer() {
        assertEquals("A programming language", flashcard.getAnswer());
    }
}

