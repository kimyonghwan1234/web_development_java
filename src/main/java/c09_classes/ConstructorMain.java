package c09_classes;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor0 =new Constructor(); //기본 생성자는 자동 생성되기 때문에 정의하지 않아도 된 경우

        //CONSTRUCTOR0의 필드에 값 대입
        constructor0.num = 38;
        constructor0.name = "안근수";

        //매개변수 생성자1을 사용하여 생성
        Constructor constructor1 = new Constructor(37);
        //이름과 나이를 constructor1에 대입함
        constructor1.num = 25;
        constructor1.name = "김용환";

        System.out.println(constructor0.name);
        System.out.println(constructor0.num);
        System.out.println("------------------");
        System.out.println(constructor1.name);
        System.out.println(constructor1.num);

        System.out.println("20241203수업 시작 부분입니다.");

        Scanner scanner = new Scanner(System.in);

        int age=0;
        String name="";

        Constructor constructor2 =new Constructor(); //기본 생성자를 통한 객체 생성
        System.out.println("당신의 나이를 입력하세요>>>");
        constructor2.num = scanner.nextInt();// Scanner로 입력받은 데이터를 곧장 객체의 필드에 대입하는 방식
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("당신의 이름을 입력하세요>>>");
        constructor2.name = scanner.nextLine();

        System.out.println("당신의 이름은 "+constructor2.name+"이고 \n당신의 나이는"+constructor2.num + "입니다.");

        //위에서 name 변수와 age변수를 사용해서 직접 생성자를 만든다면,
        System.out.println("당신의 나이를 입력해 주세요>>>");
        age = scanner.nextInt();
        Constructor constructor3 = new Constructor(age);    //사전에 입력받은 데이터를 매개변수 생성자의 argument로 사용한 방식

        System.out.println(constructor3.num);
        //Constructor(String title)을 이용한 객체 생성

//        Constructor constructor4 = new Constructor("김일");
//        constructor4.num=20;
//        System.out.println(constructor4.name);
//        System.out.println(constructor4.num);
        //Constructor(int num, String name)을 이용한 객체생성
        Constructor constructor5 = new Constructor(21, "김이");
        System.out.println(constructor5);
        //이렇게 입력했을 경우 객체의 주소값만 출력됨
        constructor5.showInfo();
        System.out.println(constructor5.toString());





    }
}
