package letterQuiz;

import java.util.Random;
import java.util.Scanner;

public class LetterGame {

    private final String[] words = {
            "airplane",
            "apple",
            "arm",
            "bakery",
            "banana",
            "bank",
            "bean",
            "belt",
            "bicycle",
            "biography",
            "blackboard",
            "boat",
            "bowl",
            "broccoli",
            "bus",
            "car",
            "carrot",
            "chair",
            "cherry",
            "cinema",
            "class",
            "classroom",
            "cloud",
            "coat",
            "cucumber",
            "desk",
            "dictionary",
            "dress",
            "ear",
            "eye",
            "fog",
            "foot",
            "fork",
            "fruits",
            "hail",
            "hand",
            "head",
            "helicopter",
            "hospital",
            "ice",
            "jacket",
            "kettle",
            "knife",
            "leg",
            "lettuce",
            "library",
            "magazine",
            "mango",
            "melon",
            "motorcycle",
            "mouth",
            "newspaper",
            "nose",
            "notebook",
            "novel",
            "onion",
            "orange",
            "peach",
            "pharmacy",
            "pineapple",
            "plate",
            "pot",
            "potato",
            "rain",
            "shirt",
            "shoe",
            "shop",
            "sink",
            "skateboard",
            "ski",
            "skirt",
            "sky",
            "snow",
            "sock",
            "spinach",
            "spoon",
            "stationary",
            "stomach",
            "strawberry",
            "student",
            "sun",
            "supermarket",
            "sweater",
            "teacher",
            "thunderstorm",
            "tomato",
            "trousers",
            "truck",
            "vegetables",
            "vehicles",
            "watermelon",
            "wind"
    };
    private String answer;
    private StringBuilder userInput;




    public LetterGame(){
        this.setupNewGame();

    }


    private void setupNewGame() {
        Random random = new Random();
        answer = words[random.nextInt(words.length)];
        userInput = new StringBuilder("_".repeat(answer.length()));


    }

    private char convertStringToChar(String input) {
        char temp = input.charAt(0);

        return (input.length() == 1 && Character.isLetter(temp)) ? temp : '\0';
    }

    private boolean isCorrectAnswer(char input) {

        return answer.indexOf(input) != -1;
    }

    private void updateGameStatus(char input) {
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == input) {
                userInput.setCharAt(i, input);
            }
        }
    }


    public void play() {
        final Scanner sc = new Scanner(System.in);
        int chanceLeft = 9;
        boolean answeredCorrectly = false;

        System.out.println("===단어맞추기를 한번 해 봐요===");

        while (!answeredCorrectly && chanceLeft != 0) {
            System.out.printf("현재 단어: %s%n", userInput);
            System.out.printf("남은 기회: %d%n", chanceLeft);

            System.out.println("알파벳을 입력해주세요.");
            char input = convertStringToChar(sc.nextLine().trim());

            if (input == '\0') {
                System.out.println("유효하지 않은 입력입니다. 알파벳 한 글자만 입력해주세요.");
                continue;
            }

            if (!isCorrectAnswer(input)) {
                chanceLeft--;
                continue;
            }

            updateGameStatus(input);
            answeredCorrectly = userInput.toString().contentEquals(answer);
        }

        if (!answeredCorrectly) {
            System.out.printf("아쉽지만 정답은 %s였습니다.%n", answer);
        } else {
            System.out.printf("%s 정답입니다! 축하드립니다!%n", answer);
        }
    }


    public static void main(String[] args) {
        LetterGame letterGame = new LetterGame();
        letterGame.play();


    }
}
