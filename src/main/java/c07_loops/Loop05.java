package c07_loops;

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {
        /*
        별찍기

        *
        **
        ***
        ****
        *****
      */
//        for(int i=1; i<6 ; i++){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();



//            }
//        }
//        }
        /*
            i=0

            i=1
            *

            i=2
            **
         */

//        for(int i=0; i<5 ; i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*
        숫자를 입력받아 그 줄 수 만큼의 별찍기가 이루어질 수 있도록 작성하시오
        예
        3
        *
        **
        ***

         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("숫자를 입력하세요>>>");
        int row = scanner.nextInt();
        for(int i=1; i<row; i++){
            for (int j=0; j<i+1; j++) {

                System.out.println("*");}


            }

    }
}
