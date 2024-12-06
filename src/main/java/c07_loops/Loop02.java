package c07_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        /*
        기본예제
        n에 숫자를 입력받아 몇번반복할지 정하고, 1부터 n까지 더하는 반복문을 작성하시오.
         */
        Scanner scanner= new Scanner(System.in);
        int n =0;
        int result1 =0;
        int result2 =0;
        System.out.println("몇번 반복할지 입력하세요>>>");
        n= scanner.nextInt();

        for (int i=0; i <n  ; i++){
            result1 += i+1;}
        for(int i=0 ; i <n+1 ; i++){
            result2+=i;
        }
        System.out.println("합은"+result1+"입니다.");
    }
}
