public class StudentInfo {

    public static void main(String[] args) {
        String name = "양한별";
        int age = 30;
        double height = 175.5;
        char grade = '0';
        boolean isStudent = false;

        System.out.println("=== 학생 정보===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.println("키: " + height + "cm");
        System.out.println("재학중: "+ isStudent);

//        System.out.printf("이름: %s%n나이: %d세%n키: %.2fcm%n학년: %c%n재학중: %b%n",name, age, height, grade, isStudent);
    }
}
