package c06_condition;

import java.util.Scanner;

public class Condition01 {
    public static void main(String[] args) {
        /*
        if문 -> 조건식을 제시하고, 그것이 참이라면 중괄호{}내의 실행문을 실행함.
        아닐 경우에는 else if 혹은 else를 사용할 수도 있음

        형식:

        if(조건문) { // 조건문: t/f로 결론이 나는 문장
        실행문
         */

        Scanner scanner= new Scanner(System.in);
        System.out.print("정수를 입력하세요>>> ");
        int num = scanner.nextInt();

        //1) if만 사용했을 때의 예제
//        if(num > 0) {
//            System.out.println("num은 양수입니다.");
//
//        }
        // 2) if - else 구조 예제
//        if(num >= 0 ) {
////            System.out.println("num은 양수이거나 0입니다.");
////        } else{ //else는 if가 false일 때 실행되는 최종 조건문이므로 조건식 포함x
////                // num이 0 미만인 경우
////            System.out.println("num은 음수입니다.");
//
//        }

        //3) if- else if구조의 예제
        if (num>0){
            System.out.println("num은 양수입니다.");
        } else if (num==0) {// if문의 조건식이 f일 경우 차후조건:순서가 중요
            System.out.println("num은 0입니다.");
        } else {
            System.out.println("num은 음수입니다.");
        }



    }
}
