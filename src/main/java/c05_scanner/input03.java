package c05_scanner;

import java.util.Scanner;

public class input03 {
    public static void main(String[] args) {
        String name;
        int age;
        String address;
        String phone;
        /*
        이름을 입력하세요>>>
        나이를 입력하세요>>>
        주소를 입력하세요>>>
        연락처를 입력하세요>>>

        사용자의 이름은 안근수이고, 나이는 37살입니다.
        주소는 부산광역시 연제구이며 연락처는 10-744577113입니다.

         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("이름을 입력하세요>>>");
        name= scanner.nextLine();
        System.out.println("나이를 입력하세요>>>");
        age= scanner.nextInt(); //-> .nextLine()을 제외한 모든 next계열이 Input02에서 배운 부분에 해당됨
      scanner.nextLine();
        System.out.println("주소를 입력하세요>>>");
        address= scanner.nextLine();
        System.out.println("연락처를 입력하세요>>>");
        phone= scanner.nextLine();
        System.out.println("사용자의 이름은" +name+ "이고, 나이는" +age+"살입니다.\n"+
                "주소는" +address+"이며 연락처는"+ phone+"입니다.");
    }
}
