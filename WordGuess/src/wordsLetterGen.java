// '**' means Ai was used here, '--' is from tutorial or someone else's code, '/m' is my code when or no label is my code
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordsLetterGen {
    public static List<String> loadWords(String filename) throws IOException {
        List<String> words = new ArrayList<>();
        // **Ai gen
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim().toLowerCase());
            }
        }
        return words;
        // **Ai gen end
    }

    // **Replace your old extractLetterCombinations with this recursive version:
    public static Set<String> extractLetterCombinations(List<String> words, int length) {
        Set<String> combos = new HashSet<>();
        extractCombosFromWords(words, length, 0, combos);
        return combos;
    }

    private static void extractCombosFromWords(List<String> words, int length, int index, Set<String> combos) {
        if (index >= words.size()) {
            return;
        }

        String word = words.get(index);
        if (length <= word.length()) {
            extractCombosFromWord(word, length, combos);
        }

        extractCombosFromWords(words, length, index + 1, combos);
    }

    private static void extractCombosFromWord(String word, int length, Set<String> combos) {
        for (int i = 0; i <= word.length() - length; i++) {
            combos.add(word.substring(i, i + length));
        }
    }

    //Picks a random substring from the set
    public static String getRandomCombo(Set<String> combos) {
        List<String> list = new ArrayList<>(combos);
        Collections.shuffle(list);
        return list.get(0);
    }

    //Checks if a word is valid (exists in list and contains the sequence)
    public static boolean isValidWord(String input, String sequence, Set<String> validWords) {
        String lowerInput = input.toLowerCase();
        return validWords.contains(lowerInput) && lowerInput.contains(sequence);
    }

}
