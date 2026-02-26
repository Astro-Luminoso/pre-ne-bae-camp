package SpartanVendingMachine;

import java.util.Map;
import java.util.Scanner;

public class VendingMachine {

    private final Map<String, Integer> itemStock = Map.of(
            "사이다", 1700,
            "콜라", 1900,
            "식혜", 2500,
            "솔의눈", 3000
    );

    private final Scanner input = new Scanner(System.in);

    private int readMoney() {
        while (true) {
            String line = input.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("금액이 비어있습니다. 다시 입력해주세요.");
                continue;
            }
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
            }
        }
    }

    private String haveItem() {
        System.out.println("구매하실 음료를 입력해주세요.");
        String itemName = input.nextLine();

        if (!itemStock.containsKey(itemName)) {
            System.out.println("죄송합니다. 해당 음료는 판매하지 않습니다.");
            System.exit(0);
        }

        return itemName;
    }



    private void processPayment(String itemName) {

        int change = 0;

        System.out.println("얼마를 넣으시겠습니까?");
        do{
           int money = readMoney();
           change = money - itemStock.get(itemName);
            if (change < 0 ) {
                System.out.println("금액이 부족합니다. 다시 입력해주세요.");
            } else {
                System.out.printf("거스름돈: %d%n", change);
            }
        } while (change < 0);
    }

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        System.out.println("===스파르탄 자판기===");
        String itemName = vendingMachine.haveItem();
        vendingMachine.processPayment(itemName);
        System.out.println("===구매 완료===");
    }
}