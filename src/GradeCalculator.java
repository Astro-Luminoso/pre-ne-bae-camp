public class GradeCalculator {
    public static void main(String[] args) {
        int[] grades = {20, 65, 80, 92, 30};

        double averageGrade = 0;
        for (int grade : grades) {
            averageGrade += grade;
        }
        averageGrade /= grades.length;

        char grade = 'F';

        if (averageGrade >= 90) grade = 'A';
        else if (averageGrade >= 80) grade = 'B';
        else if (averageGrade >= 70) grade = 'C';
        else if (averageGrade >= 60) grade = 'D';

        System.out.println("===성적 계산기===");
        System.out.printf("계산결과, 평균 %.2f로, %c학점이십니다.", averageGrade, grade);
    }
}
