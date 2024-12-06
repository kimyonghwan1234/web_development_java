package c05_scanner;

import java.util.Scanner;

public class input02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("X 입력:");
//        int X = scanner.nextInt();
//        System.out.println("Y 입력:");
//        int Y = scanner.nextInt();
//        System.out.println("X + Y="+(X+Y));
//        //올바른 연산
//        System.out.println("X + Y="+X+Y);
        // x, y가 String취급받아 틀린 연산 출력
        /*
            평균 계산기를 작성하시오

            지시사항
            1. 사용자로부터 세 개의 실수를 입력 받아, 이 숫자들의 평균 및 합을 계산하고,출력하시오
            2. 사용자에게 첫번째 실수를 입력받으세요
            3. 사용자에게 두번째 실수를 입력받으세요
            4. 사용자에게 첫번째 실수를 입력받으세요
            5. 총합과 평균을 꼐산하고 출렷하세요

         */
        double num1;
        double num2;
        double num3;
        double sum;
        double avg;

        System.out.print("첫 번째 실수를 입력하세요>>>");
        num1= scanner.nextDouble();
        System.out.print("두 번째 실수를 입력하세요>>>");
        num2= scanner.nextDouble();
        System.out.print("세 번째 실수를 입력하세요>>>");
        num3= scanner.nextDouble();
        sum=num1+num2+num3;
        avg=sum/3;

        System.out.print("총합은"+sum+"입니다.\n");
        System.out.println("평균은"+avg+"입니다.");

    }
}
