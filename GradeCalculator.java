public class GradeCalculator {

    public String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public String calculateAverageGrade(int[] marks) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        int averageMarks = totalMarks / marks.length;
        return calculateGrade(averageMarks);
    }

    public static void main(String[] args) {
        GradeCalculator gradeCalculator = new GradeCalculator();
        
        int[] studentMarks = {85, 90, 78, 92, 88}; 
        for (int marks : studentMarks) {
            System.out.println("Marks: " + marks + " - Grade: " + gradeCalculator.calculateGrade(marks));
        }

        String averageGrade = gradeCalculator.calculateAverageGrade(studentMarks);
        System.out.println("Average Grade: " + averageGrade);
    }
}
