// Write a Java program to count how many times each word appears in a given sentence using a HashMap.

import java.util.HashMap;
import java.util.Scanner;

public class WordInSentenceCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // Convert the sentence to lowercase and split by spaces
        String[] words = sentence.toLowerCase().split("\\s+");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Loop through each word
        for (String word : words) {
            // Remove punctuation (optional)
            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.isEmpty()) continue;

            // If word already exists, increment count
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // Otherwise add new word with count 1
                wordCount.put(word, 1);
            }
        }

        // Display results
        System.out.println("\nWord frequencies:");
        for (String key : wordCount.keySet()) {
            System.out.println(key + " : " + wordCount.get(key));
            System.out.println("");
        }

        sc.close(); // Always close the scanner
    }
}
