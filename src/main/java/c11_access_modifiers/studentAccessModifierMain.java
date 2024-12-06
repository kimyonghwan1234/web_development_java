package c11_access_modifiers;
//기본 생성자를 통해 StudentAccessModifierMain에 student1객체 생성

//학번에 20241205, 이름에 김용환, 평균에100.0을 대입

// showInfo()메서드를 public으로 정의

//실행 예
// 김용환 학생의 학번은 20241205이며, 평균 점수는 100.0점입니다.

public class studentAccessModifierMain {
    public static void main(String[] args) {
        StudentAccessModifier student1 = new StudentAccessModifier();

        //setter를 통해서 데이터 입력

        student1.setStudentName("김용환");
            System.out.println(student1.getStudentName());

        student1.setStudentAvg(100.0);
        System.out.println(student1.getStudentAvg());

        student1.setStudentCode(20241205);
        System.out.println(student1.getStudentCode());


        // .showInfo() 메서드를 통해서 객체 정보 출력
        student1.showInfo();

        //새로운 객체를 student01로 생성하는데, 생성시 이름을 "김용환"으로
        //점수는 4.5, 학번은 10101로 입력
        StudentAccessModifier student01 = new StudentAccessModifier(10101, "김용환", 4.5);


        //"김용환"을 "이일"로 고치기
        student01.setStudentName("이일");

        //고친 이름을 콘솔창에서 확인하기 위해 getter를 사용
        System.out.println(student01.getStudentName());

        //이름이 "이일"로 고쳐졌다면, showInfo()를 통해 정보를 콘솔에 출력
        //showInfo()의 경우 메서드 내에 sout으로 처리했기 때문에 getter정보를 출력할 때와
        //코드가 다르다.
        student01.showInfo();




    }
}
