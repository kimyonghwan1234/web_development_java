package c07_loops;

import java.util.Scanner;

public class Loop03 {
    public static void main(String[] args) {
        /*
        중첩 for문(multiple for sentence)

        형식:

        for(int i=0; i<10 ; i++){
        (실행문1) ->() optional: 있어도 되고 없어도 됨
        for(int j=0;j<10 ; j++){
        실행문2
        }
        (실행문3)
        }
         */

//        int a=0;
//        int b=0;
//        for(int i=0 ; i<10 ; i++){
//            a=i;
//            System.out.println("a의 값:"+a);
//            for(int j =0;j<10;j++){
//                b=j;
//                System.out.println("b의 값:"+b);
//            }
//            System.out.println("---a의 값이 바뀌는 지점입니다.---");
//        }
        /*
        숫자 하나를 입력받아, 그 숫자에 해당하는 구구단을 출력하시오
        예
        숫자를 입력하세ㅐ요ㅕ>>>>2
        2 x1=2
        2x2=4
        '''
        2x9=18
         */
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("숫자를 입력하세요>>>");
//        int dan= scanner.nextInt();
//
//        for(int i =1; i<10 ; i++){
//            int answer= dan*i;
//            System.out.println(dan+"X"+i+"="+answer);


        /*
        구구단 출력
        실행 예

         */


         for(int i=2; i<10; i++){
            for(int j=1 ;j<10; j++ ){

            System.out.println(i+"x"+j+"="+(i*j));

            }
            System.out.println("-------------");

        }


    }
}
