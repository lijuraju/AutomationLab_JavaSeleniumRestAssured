package corejava.sep202024;

public class Lab05_GradeCalculator_TernaryOperator {
    public static void main(String[] args) {
        int score =70;
        String grade;

       grade = ((score>=90) ? "A" : (score>=80)? "B" : (score >=70)? "C": (score>=60)? "D" : "F");
        System.out.println(grade);
    }
}
