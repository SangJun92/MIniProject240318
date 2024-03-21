package Test_240321;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Country {

    public static void main(String[] args) {
        System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> nations = new HashMap<>();

        // 5개의 나라 이름과 인구를 입력받아 해시맵에 저장
        for (int i = 1; i <= 5; i++) {
            System.out.print("나라 이름, 인구 >> ");
            String name = scanner.next();
            int population = scanner.nextInt();
            nations.put(name, population);
        }

        // 가장 인구가 적은 나라 찾기
        Map.Entry<String, Integer> minPopulationCountry = findMinPopulationCountry(nations);

        System.out.println("제일 인구가 적은 나라는 (" + minPopulationCountry.getKey() + ", " + minPopulationCountry.getValue() + ")");

        scanner.close();
    }

    // 가장 인구가 적은 나라를 찾는 메서드
    private static Map.Entry<String, Integer> findMinPopulationCountry(Map<String, Integer> nations) {
        Map.Entry<String, Integer> minCountry = null;
        int minPopulation = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : nations.entrySet()) {
            if (entry.getValue() < minPopulation) {
                minPopulation = entry.getValue();
                minCountry = entry;
            }
        }

        return minCountry;
    }
}
