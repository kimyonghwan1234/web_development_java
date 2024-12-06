package c05_scanner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int year;

        System.out.println("윤년인지 확인하고자 하는 년도를 입력하세요>>>");
        year = scanner.nextInt();
        /*
         year에 특정한 년도를 넣었을 때, 해당 년도가 윤년이라면 true,  아니면 false 출력하는 프로그램 작성

         조건
         해당 year이 4배수면 윤년
         하지만 100의 배수이면 윤년이 아님
         근데 또 400의 배수이면 윤년에 해당

         */
        boolean result = year %4==0 && year%100!=0|| year%400 ==0 ;
        System.out.println(year + "년은 윤년입니까?:" +result);


    }
}
