package Test_240321;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Account {

    public static void main(String[] args) {
        System.out.println("<< 통장 관리 프로그램입니다. >>");

        Scanner scanner = new Scanner(System.in);
        // 이름과 금액을 저장할 맵
        Map<String, Integer> accountMap = new HashMap<>();

        while (true) {
            System.out.print("이름과 금액 입력>> ");
            String input = scanner.nextLine();

            // 종료 조건 확인
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }
            
            // 입력 받은 문자열을 공백을 기준으로 분할
            String[] tokens = input.split("\\s+"); 
            if (tokens.length == 2) { // 이름과 금액이 모두 입력된 경우
                String name = tokens[0];
                int amount = Integer.parseInt(tokens[1]);

                // 통장에 있는 금액 업데이트
                accountMap.put(name, accountMap.getOrDefault(name, 0) + amount);
            }

            // 현재 통장 상태 출력
            StringBuilder sb = new StringBuilder("(");
            for (Map.Entry<String, Integer> entry : accountMap.entrySet()) {
                sb.append(entry.getKey()).append(">").append(entry.getValue()).append("원)");
                if (entry.getKey().equals("홍길동")) {
                    sb.append("(");
                }
            }
            // 마지막 괄호 삭제
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '(') {
                sb.deleteCharAt(sb.length() - 1);
            }
            System.out.println(sb.toString());
        }

        scanner.close();
    }
}
