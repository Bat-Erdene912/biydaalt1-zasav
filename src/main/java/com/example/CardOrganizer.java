import java.util.List;
import java.util.Map;

public interface CardOrganizer {
    List<Map.Entry<String, String>> sortCards(Map<String, String> flashcards, Map<String, Integer> mistakes);
}
