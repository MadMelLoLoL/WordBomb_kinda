// Madison Bazan
// 7/18/2025
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> wordList = wordsLetterGen.loadWords("words.txt");
        Set<String> validWords = new HashSet<>(wordList); // **ai line

        
        Set<String> allCombos = new HashSet<>(); // ** 
        for (int length = 1; length <= 3; length++) {
            allCombos.addAll(wordsLetterGen.extractLetterCombinations(wordList, length));
        }
        Scanner scnr = new Scanner(System.in);
        int totalScore = 0;

    //game loop
        while(true){
            String targetCombo = wordsLetterGen.getRandomCombo(allCombos);
            System.out.println("Type a word that contains: " + targetCombo);

            String playerInput = scnr.nextLine();

            int length = playerInput.length();
            public class points {
                public static int getScore(int length) { // ** was reccomendded to us a class rather than single line
                    return length; 
                }
            }
            totalScore += score;
            
            //game results
            if (wordsLetterGen.isValidWord(playerInput, targetCombo, validWords)) {
                System.out.println("✅ Correct!");
                System.out.println("Your word has " + length + " letters. " + "Your score is now " + totalScore);
            } else {
                System.out.println("❌ Wrong! Game over :( Your final score is " + totalScore);
                break;
            }
        }
        scnr.close();
    }
}
