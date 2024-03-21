package Test_240321;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Coke {

    public static void main(String[] args) {
        System.out.println("밀키스, 코카콜라, 펩시, 칠성사이다 있습니다.");

        Map<String, Integer> cokePrices = new HashMap<>();
        cokePrices.put("밀키스", 700);
        cokePrices.put("코카콜라", 800);
        cokePrices.put("펩시", 900);
        cokePrices.put("칠성사이다", 1200);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("선택 >> ");
            String drink = scanner.nextLine();

            if (cokePrices.containsKey(drink)) {
                int price = cokePrices.get(drink);
                System.out.println(drink + "는 " + price + "원 입니다.");
            } else if (drink.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            } else {
                System.out.println("다시 적어주세요.");
            }
        }

        scanner.close();
    }
}
