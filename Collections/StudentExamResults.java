import java.util.*;

public class StudentExamResults {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Alice", 85);
        studentScores.put("Bob", 78);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 88);
        studentScores.put("Eve", 95);

        System.out.println("Student Exam Results (Unsorted - HashMap):");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        TreeMap<String, Integer> sortedScores = new TreeMap<>(studentScores);

        System.out.println("\nStudent Exam Results (Sorted by Name - TreeMap):");
        for (Map.Entry<String, Integer> entry : sortedScores.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        String topStudent = Collections.max(studentScores.entrySet(), Map.Entry.comparingByValue()).getKey();
        int topScore = studentScores.get(topStudent);
        
        System.out.println("\nTop Scoring Student: " + topStudent + " with " + topScore + " marks.");
    }
}
