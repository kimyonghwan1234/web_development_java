package c11_access_modifiers;
/*
접근지정자(Access Modifier):
    클래스, 메서드, (필드) 변수 등에 대한 접근 권한을 제어하는 데 사용됨.

    종류:
        1) public: 모든 클래스에서 접근할 수 있음
        2) protected : 같은 패키지 내의 클래스 및 이 클래스를 상속받은
                        자식 클래스에서 접근 가능
        3) default(package-private): 접근 지정자를 명시하지 않으면
                        default로 간주되며 ,같은 패키지 내의 클래스에서만 접근 가능
        4) private: 같은 클래스 내에서만 접근 가능

 */
public class StudentAccessModifier {
    private int studentCode;
    private String studentName;
    private double studentAvg;

    //기본 생성자, 매개변수 생성자 전부 선언.

    //필드 별 Setter/ Getter 선언

    //기본 생성자를 통해 StudentAccessModifierMain에 student1객체 생성

    //학번에 20241205, 이름에 김용환, 평균에100.0을 대입

    // showInfo()메서드를 public으로 정의

    //실행 예
    // 김용환 학생의 학번은 20241205이며, 평균 점수는 100.0점입니다.


    public StudentAccessModifier() {
    }

    public StudentAccessModifier(int studentCode) {
        this.studentCode = studentCode;
    }

    public StudentAccessModifier(String studentName) {
        this.studentName = studentName;
    }

    public StudentAccessModifier(double studentAvg) {
        this.studentAvg = studentAvg;
    }

    public StudentAccessModifier(int studentCode, String studentName, double studentAvg) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.studentAvg = studentAvg;
    }

    // Getter/ Setter 정의 했는데 -> 필드별로 정렬

    public void setStudentName(String studentName){
        this.studentName= studentName;}

    public String getStudentName(){
        return studentName;
    }


    public void setStudentCode(int studentCode){
        this.studentCode=studentCode;}

    public int getStudentCode(){
        return studentCode;
    }

    public void setStudentAvg(double studentAvg) {
        this.studentAvg = studentAvg;
    }
    public double getStudentAvg(){
        return studentAvg;
    }
    public void showInfo(){
        System.out.println(studentName+" 학생의 학번은 "+studentCode+"이고, 평균 점수는 "+studentAvg+"점 입니다.");
    }


}
