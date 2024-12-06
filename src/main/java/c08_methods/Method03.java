package c08_methods;

import java.util.Scanner;

/*
method02 Refactoring
 */
public class Method03 {


    public static String getStar(int menuSelect, int totalLine) {
        String result = "";


        switch (menuSelect) {
            case 1:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;


            case 2:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - i - 1; j++) {
                        result += " ";
                    }

                    for (int k = 0; k < i + 1; k++) {
                        result += "*";
                    }
                }
                break;

            case 3:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - i; j++) {
                        result += "*";
                    }
                }
                break;
            case 4: {
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < i; j++) {
                        result += " ";
                    }
                    for (int k = 0; k < totalLine - i; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
            }
            break;


            default:
                System.out.println("잘못된입력입니다.");

        }

        return result;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rowOfStars;
        int choice;

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른으로 치우친 감소하는 별");
        System.out.print("메뉴선택 : ");
        choice=scanner.nextInt();

        while (choice>4||choice<1){
            System.out.println("다시 메뉴를 선택하세요>>>");
            choice= scanner.nextInt();
        }

        System.out.print("별의 줄 수 입력:");
        rowOfStars= scanner.nextInt();


        System.out.println("[호출하신 결과입니다]");

        String stars = getStar(choice, rowOfStars);

        System.out.println(stars);

    }


}
