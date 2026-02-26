package randomNickname;

import java.util.Random;

public class RandomNicknameGenerator {

    private String[] firstAdjectives = {"기철초풍", "멋있는", "재미있는"};
    private String[] secondAdjectives = {"도전적인", "노란색의", "바보같은"};
    private String[] nouns = {"돌고래", "개발자", "오랑우탄"};

    private Random random = new Random();


    public String getRandomNickName(String[] nickNames, int arrayLength) {
        return nickNames[random.nextInt(arrayLength)];
    }

    public static void main(String[] args) {
        RandomNicknameGenerator nicknameGenerator = new RandomNicknameGenerator();

        System.out.println("===랜덤 닉네임 생성기===");
        System.out.printf("%s %s %s%n",
                nicknameGenerator.getRandomNickName(nicknameGenerator.firstAdjectives, nicknameGenerator.firstAdjectives.length),
                nicknameGenerator.getRandomNickName(nicknameGenerator.secondAdjectives, nicknameGenerator.secondAdjectives.length),
                nicknameGenerator.getRandomNickName(nicknameGenerator.nouns, nicknameGenerator.nouns.length));
    }
}
