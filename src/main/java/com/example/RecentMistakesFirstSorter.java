import java.util.*;

public class RecentMistakesFirstSorter implements CardOrganizer {
    @Override
    public List<Map.Entry<String, String>> sortCards(Map<String, String> flashcards, Map<String, Integer> mistakes) {
        List<Map.Entry<String, String>> cardList = new ArrayList<>(flashcards.entrySet());
        cardList.sort((a, b) -> mistakes.getOrDefault(b.getKey(), 0) - mistakes.getOrDefault(a.getKey(), 0));
        return cardList;
    }
}
