package c09_classes;

public class Student02 {
    int studentCode;
    String name;
    Double score;

    public Student02(int studentCode) {
        this.studentCode = studentCode;
    }

    public Student02(String name) {
        this.name = name;
    }

    public Student02(Double score) {
        this.score = score;
    }

    public Student02(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student02(int studentCode, String name, Double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }


    /*생성자 getter setter toString equals() hash()을 자동생성 하는법
    메뉴바 - code - generate로 들어가서 해당 메뉴 클릭
    or -> alt insert, shift누르면 자동으로 만들어짐
    1.alt+insert
    2.Constructor
    3. 어떤 필드를 기준으로 생성자를 만들지 체크*/

}
