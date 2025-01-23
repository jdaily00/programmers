import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String inputLine;
        double totalCredits = 0.0;
        double weightedSum = 0.0;

        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        while ((inputLine = br.readLine()) != null && !inputLine.isEmpty()) {
            
            String[] parts = inputLine.split(" ");
            String courseName = parts[0];
            double credits = Double.parseDouble(parts[1]);
            String grade = parts[2];

            // "P" 등급은 계산에서 제외
            if (grade.equals("P")) continue;

            // 유효한 학점과 등급만 계산
            totalCredits += credits;
            weightedSum += credits * gradeMap.get(grade);
        }

        // 전공평점 계산
        double majorGPA = weightedSum / totalCredits;
        
        System.out.printf("%.6f%n", majorGPA);
    }
}