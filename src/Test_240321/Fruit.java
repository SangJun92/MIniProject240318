package Test_240321;

import java.util.Scanner;

public class Fruit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
            	System.out.println("종료합니다... ");
                break;
            }
            // 어절 개수 계산
            int wordCount = countWords(input);
            
            System.out.println("어절 개수는 " + wordCount);
        }
        
        scanner.close();
    }
    
    // 주어진 텍스트에서 어절 개수를 세는 메서드
    public static int countWords(String text) {
        String[] words = text.split(",\\s*"); // 공백을 기준으로 문자열 분할
        return words.length;
    }
}
