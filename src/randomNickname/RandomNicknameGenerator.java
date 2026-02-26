package randomNickname;

import java.util.Random;

public class RandomNicknameGenerator {

    private final String[] firstAdjectives = {"기철초풍", "멋있는", "재미있는"};
    private final String[] secondAdjectives = {"도전적인", "노란색의", "바보같은"};
    private final String[] nouns = {"돌고래", "개발자", "오랑우탄"};

    private final Random random = new Random();

    /**
     * Generates a complete random nickname by combining random adjectives and a noun
     * @return a randomly generated nickname string
     */
    public String generateNickname() {
        return getRandomElement(firstAdjectives) + " " +
               getRandomElement(secondAdjectives) + " " +
               getRandomElement(nouns);
    }

    /**
     * Returns a random element from the given array
     * @param array the array to select from
     * @return a randomly selected element
     */
    private String getRandomElement(String[] array) {
        return array[random.nextInt(array.length)];
    }

    public static void main(String[] args) {
        RandomNicknameGenerator nicknameGenerator = new RandomNicknameGenerator();

        System.out.println("===랜덤 닉네임 생성기===");
        System.out.println(nicknameGenerator.generateNickname());
    }
}
