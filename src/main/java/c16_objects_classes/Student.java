package c16_objects_classes;

import java.util.Objects;

/*
    toString(), equals(), hashCode()

    1.toString():객체의 문자열 표현
    기본적으로 모든 클래스는 object클래스를 상속받으며, object의 toString 메서드는
    클래스 이름과 해시코드를 반환함 -> 이를 Override를 통해서 재정의해서 사용하는 편

    왜 사용하는가? : 사람이 읽기 좋도록 표기하기 위해서

    2.equals() : 객체의 동등성 표현
        두 객체가 '논리적으로 같은지'를 비교하는 메서드
        기봊넉으로 object 클래스의 equals 메서드는 두 객체의 참조 주소를 비교합니다.
        형식:
            객체명1.equals(객체명2)       ->객체명1과 객체명2의 참조 주소가 동일한지 확인 : 3형식 문장

    3. hashCode(): 객체의 고유 값
    객체를 정수 값(해시 값)으로 반환
    해시값은 주로 해시 기반 컬렉션에서 사용된다. (Collections 파트에서 hashMap, hashSet개념을 배울 때 언급 예정)
    equals()를 override하면 hashCode()도 '반드시 override'해야 한다.
        -동일한 객체 (equals()==true)는 동일한 해시 코드를 가져야만 하기 때문인데, 문제는
        -해시 코드가 같다고 해서 항상 equals()가 true인 것은 아니다.
 */
public class Student {
    /*
        1. Student 클래스에 학생 이름(name)과 학번(studentId)을 저장하는 필드를 작성
        2. equals(), hashCode() 메서드를 재정의하여 학생 객체들이 같은지 여부를 이름과 학번으로 비교하도록 작성

        지시사항
        1. student클래스는 name과 studentId를 private접근 지정자로 가지고 있어야함
        2. Allargsconst로 생성자를 만듬
            -student1 - name ="안근수 / studentId=20241213
            -student2 - name ="김용환" / studentId=20240000
        3. equals()메서드를 오버라이드하여, 두 학생 객체가 이름과 학번이 모두 같으면 true를 반환하도록 구현
        4. hashCode()메서드를 오버라이드하여, 이름과 학번을 기반으로 한 해시 코드를 반환하도록 구현해야홤
        5. 각 필드별로 게터세터구현
        6. Student 클래스를 활용하여 학생 객체를 생성하고, toString()메서드를 이용해 학생의 이름과 학번을 포함한
        모든 정보를 출력하는 예제를 작성
     */
    private String name;
    private int studentId;

    //2번
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    //3,4번
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

        //재정의
    @Override
    public String toString() {
        return "해당 학생의 이름은 " +name+"이고, 학번은 "+studentId+"입니다.";
    }
}
