import java.util.*;

class Dictionary<K extends String, V extends String> {
    private TreeMap<K, V> dictionary;

    public Dictionary() {
        dictionary = new TreeMap<>();
    }

    public void addWord(K word, V translation) {
        dictionary.put(word, translation);
    }

    public V getTranslation(K word) {
        return dictionary.getOrDefault(word, "Translation not found.");
    }

    public void displayDictionary() {
        System.out.println("Multi-Language Dictionary:");
        for (Map.Entry<K, V> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

public class MultiLanguageDictionary {
    public static void main(String[] args) {
        Dictionary<String, String> englishToSpanish = new Dictionary<>();

        englishToSpanish.addWord("Hello", "Hola");
        englishToSpanish.addWord("Thank you", "Gracias");
        englishToSpanish.addWord("Goodbye", "Adiós");
        englishToSpanish.addWord("Please", "Por favor");
        englishToSpanish.addWord("Yes", "Sí");
        
        englishToSpanish.displayDictionary();

        System.out.println("\nTranslation for 'Hello': " + englishToSpanish.getTranslation("Hello"));
        System.out.println("Translation for 'Welcome': " + englishToSpanish.getTranslation("Welcome"));
    }
}
