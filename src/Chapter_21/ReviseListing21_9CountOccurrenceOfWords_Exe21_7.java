package Chapter_21;

import java.util.*;

/** **21.7 (Revise Listing 21.9, CountOccurrenceOfWords.java) Rewrite Listing 21.9 to
 display the words in ascending order of occurrence counts.
 (Hint: Create a class named WordOccurrence that implements the Comparable
 interface. The class contains two fields, word and count. The compareTo
 method compares the counts. For each pair in the hash set in Listing 21.9, create
 an instance of WordOccurrence and store it in an array list. Sort the array list
 using the Collections.sort method. What would be wrong if you stored the
 instances of WordOccurrence in a tree set?) */

public class ReviseListing21_9CountOccurrenceOfWords_Exe21_7 {
    /** Main method */
    public static void main(String[] args) {
        // Set text in a String
        String text = "Good morning. Have a good class. Have a good visit. Have fun!";

        // Create a TreeMap to store words as a kye and count as value
        Map<String, Integer> map = new TreeMap<>();
        ArrayList<WordOccurrence> arrayList = new ArrayList<>();

        String[] words = text.split("[ \n\t\r.,:;!?(){]");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();

            if (key.length() > 0) {
               if (!map.containsKey(key))
                   map.put(key, 1);
               else {
                   int value = map.get(key);
                   value++;
                   map.put(key, value);
               }
            }
        }


        // Get all entries into a set
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // Get key and value from each entry
        for (Map.Entry<String, Integer> entry: entrySet) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
            arrayList.add(new WordOccurrence(entry.getKey(), entry.getValue()));
        }

        System.out.println();

        Collections.sort(arrayList);
        for (WordOccurrence e: arrayList) {
            System.out.println(e);
        }
    }
}

class WordOccurrence implements Comparable<WordOccurrence> {
    private String word;
    private int count;

    WordOccurrence(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int compareTo(WordOccurrence o) {
        if (count > o.getCount())
            return 1;
        else if (count < o.getCount())
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        String s = String.format("%-10s%d", word, count);
        return s;
    }
}
