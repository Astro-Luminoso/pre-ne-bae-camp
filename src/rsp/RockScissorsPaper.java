package rsp;

import java.util.*;

public class RockScissorsPaper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"가위", "바위", "보"};
        Map<Integer, String> gifts = new HashMap<>();
        gifts.put(0, "꽝");
        gifts.put(1, "곰돌이 인형");
        gifts.put(2, "스파르타 랜드 입장권");
        gifts.put(3, "스파르타 캐니언 항공 투어권");
        gifts.put(4, "호텔 스파르타 숙박권");
        gifts.put(5, "스파르테이트 항공권");

        int userWinCount = 0;
        int gameCount = 0;

        while(gameCount<5) {
            StringBuilder result = new StringBuilder();
            System.out.println("가위, 바위, 보 중 하나를 입력해주세요.");
            String userChoice = sc.nextLine().trim();
            if(!Arrays.asList(choices).contains(userChoice)) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }
            String computerChoice = choices[random.nextInt(choices.length)];
            result.append(String.format("당신은 %s, 상대는 %s이므로, 당신은 ", userChoice, computerChoice));

            if (userChoice.equals(computerChoice)) {
                result.append("비겼습니다.%n");
            } else if ((userChoice.equals("가위") && computerChoice.equals("바위")) ||
                    (userChoice.equals("바위") && computerChoice.equals("보")) ||
                    (userChoice.equals("보") && computerChoice.equals("가위")))
                result.append("졌습니다.%n");
            else {
                result.append("이겼습니다.%n");
                userWinCount++;
            }
            System.out.printf(result.toString());
            gameCount++;
        }

        System.out.println("===가위바위보 게임 결과===");
        System.out.printf("총 %d회 중 %d회 이겼습니다.%n선물로 %s를 드립니다!%n", gameCount, userWinCount, gifts.get(userWinCount));
    }
}
