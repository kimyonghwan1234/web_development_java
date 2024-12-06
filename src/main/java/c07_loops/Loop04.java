package c07_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        /*
        while문

        형식:
        while(조건문) {
            실행문
        }
         */
//        int result =0;
//        for (int i=1; i<6; i++){
//            result += i;}
//        System.out.println(result);

//        int sum2 =0;
//        int i =0;
//        //while문을 활용한 1~5까지의 합 코드
//        while(i<6){
//            sum2+=i;
//            System.out.println(sum2);
//            i++;        //i를 증가시켜서 무한루프에서 탈출시키고 합을 구하기 위함
//        }
//        System.out.println("최종합계 :" +sum2);
//        System.out.println("i의 최종 값:"+ i);
        /*
        이상의 for문과 while문에서 확인할 수 있듯이
         for문의 경우:
            한계값을 설정하기 깨문에 정확한 반복의 횟수를 알 수 있음
                -> 반복 횟수를 고정시킬 수 있을 때 주로 사용
         while문의 경우:
            외부에서 변수를 선언한 다음에 강제로 증가시키는 편이기 때문에
                횟수를 고려한 반복문에는 덜 적절함.
                대신, 특정 조건을 만족하는자 아닌지와 같이 횟수와 관계없는 경우
                while 반복문이 사용됨.

         */
        Scanner scanner = new Scanner(System.in);
        int answer=0;
        boolean continued = true;
        boolean endOfGame = false;

        //범용적이고 읽기 쉬운 코드를 위한 습관
        while(!endOfGame) {
            System.out.println("계속 하시겠습니까>>>");
            answer = scanner.nextInt();
            if (answer==1){
                endOfGame=true;

            }
        }
        while(continued){
            System.out.println("계속 하시겠습니까>>>");
            answer = scanner.nextInt();
            if (answer==1){
                continued=false;
            }
        }


    }
}
