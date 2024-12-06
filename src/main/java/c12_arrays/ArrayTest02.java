package c12_arrays;

import java.util.Scanner;

/*
    String[] names 배열을 선언하고
    출석부의 이름을 입력하도록 하여, names 배열에 집어넣는 프로그램을 작성합니다.

    실행 예
    몇명의 학생을 등록하겠습니까? >>>12
    1번 학생 이름:강미경
    2번 학생 이름:권상재
    3번 학생 이름:김용환
    4번 학생 이름:김은수
    5번 학생 이름:박경호
    6번 학생 이름:박수빈
    7번 학생 이름:염진우
    8번 학생 이름:이시후
    9번 학생 이름:아하온
    10번 학생 이름:장시원
    11번 학생 이름:황지선
    12번 학생 이름:안근수
    ->count에 선언된 수 만큼 학생 이름을 입력할 수 있도록 반복문을 작성해야 함.
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 몇 개짜리 방의 배열을 만들 것인가를 count 변수에 초기화
        int count = 0;

        //배열의 크기를 결정 짓기 위해서
        System.out.print("몇 명의 학생을 등록하시겠습니까?>>>");
        count = scanner.nextInt();
        //위에서 .nextInt()를 사용했고, 밑에 학생 이름을 입력 받을 예정이기 때문에
        scanner.nextLine(); //배리어 미리 작성

        // String배열 선언 및 초기화
        String[] names = new String[count];

        //학생의 이름을 count 횟수만큼 입력받기 위한 반복문 작성

        for(int i=0 ; i< count; i++){
            System.out.print((i+1)+"번 학생 이름: ");
            names[i]= scanner.nextLine();
        }

        //학생의 이름을 출력하기 위한 반복문 작성

        System.out.println("[출력 결과]");
        for(int i=0; i<count; i ++){
            System.out.println((i+1)+". "+names[i]);
        }

        //count만큼 입력 받았기 떄문에 count.length 로도 가능
//        for(int i=0; i< names.length; i ++){
//            System.out.println((i+1)+". "+names[i]);
//        }




    }
}