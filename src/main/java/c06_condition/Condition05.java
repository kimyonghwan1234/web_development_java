package c06_condition;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int score;
        int changedScore;
        String grade;
        System.out.println("당신의 점수를 입력하세요>>>");
        score= scanner.nextInt();

        changedScore= score/10;
        //int changedScore가 올바른 값이 출력되는지 확인하기 위한 test code
       // System.out.println(changedScore);
        /*
        changedScore = 10혹은 9면 A
        ...
        5이하면 F
         */
//        if (score<0||score>100) {
//            System.out.println("점수를 잘못 입력하셨습니다.");
//            grade="X";
//            else{
//                switch(changedScore) {
//                    case 10:
////                        grade = "A";
////                        System.out.println("당신의 점수는 "+changedScore+"입니다.");
////                        break; 10점도 아래로 내려가며 A가 나온다.
//                    case 9:
//                        grade = "A";
//                        System.out.println("당신의 점수는 "+changedScore+"입니다.");
//                        break;
//                    case 8:
//                        grade = "B";
//                        System.out.println("당신의 점수는 "+changedScore+"입니다.");
//                        break;
//                    case 7:
//                        grade = "C";
//                        System.out.println("당신의 점수는 "+changedScore+"입니다.");
//                        break;
//                    case 6:
//                        grade = "D";
//                        System.out.println("당신의 점수는 "+changedScore+"입니다.");
//                        break;
////                   case 5:
//                    default:
//                        grade = "F";
//                        System.out.println("당신의 점수는 "+changedScore+"입니다.");
//                        break;
//
//
//
//
//                }
//            }

        if (score>=0&&score<=59) {
            System.out.println("당신의 점수는"+score+"이고, 등급은 F입니다.");
            grade="X";}
            else {
            switch (changedScore) {
                case 10:
                    grade = "A";
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
            }
        }



    }

}
