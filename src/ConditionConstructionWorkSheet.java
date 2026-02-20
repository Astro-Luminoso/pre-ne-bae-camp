import java.util.Scanner;


public class ConditionConstructionWorkSheet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름은?: ");
        String name = sc.nextLine();
        System.out.print("키는?(cm): ");
        double height = sc.nextDouble();
        System.out.print("몸무게는?(kg):");
        double weight = sc.nextDouble();
        if (height < 15 || weight < 5){
            System.out.println("Are you a human?");
            System.exit(0);
        }
        double heightInMeter = height/100;

        double bmi = weight / (heightInMeter * heightInMeter);
        String result;

        if (bmi < 18.5)
            result = "저체중";
        else if (bmi < 23)
            result = "정상";
        else if (bmi < 30)
            result = "1단계 비만";
        else if (bmi < 35)
            result = "2단계 비만";
        else
            result = "고도비만";

        System.out.printf("%s님은 현재 bmi수치가 %.2f인 관계로 계산 결과 %s 이십니다.%n", name, bmi, result);
    }
}