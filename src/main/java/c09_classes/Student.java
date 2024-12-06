package c09_classes;
/*
학번, 이름, 점수(A,B,C,D,F) field선언합니다.
기본 생성자
학번을 매개변수로 하는 생성자
이름을 매개변수로 하는 생성자
점수를 매개변수로 하는 생성자
학번, 이름, 점수를 매개변수로 하는 생성자

showinfo() 메서드를 정의
학번:12345
이름: 이일
점수: A등급
 */
public class Student {
    int num;
    String name;


    void showInfo() {
        System.out.println("학번:" + num);
        System.out.println("이름:" + name);

    }

    Student() {
        System.out.println("기본생성자");
    }

    Student(int number) {
        System.out.println("1arguments");
        this.num = number;
    }

    Student(String name) {
        System.out.println("1arguments");
        this.name = name;
    }



    Student(int number, String name) {
        this.num = number;
        this.name = name;

    }


}
