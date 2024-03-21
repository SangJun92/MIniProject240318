package Test_240321;

import java.util.Scanner;

public class CircleArray {
    static class Circle { // Circle 클래스를 정적 내부 클래스로 변경
        private int radius;
        
        public Circle(int radius) {
            this.radius = radius;
        }
        
        public double getArea() {
            return radius * radius * 3.14;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Circle circles[] = new Circle[4]; // Circle 객체 배열 생성
        double totalSum = 0;
        
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + " 반지름 >> ");
            int radius = scanner.nextInt();
            
            circles[i] = new Circle(radius); // Circle 객체 생성하여 배열에 저장
            totalSum += circles[i].getArea(); // 각 원의 면적을 totalSum에 더하기
        }
        
        System.out.println("저장하였습니다...");
        System.out.println("원의 면적 전체 합은 " + totalSum);
        
        scanner.close();
    }
}
