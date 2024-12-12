package c16_objects_classes;
/*
    모든 클래스는 object 클래스를 상속 받는다 -> 우리가 정의한 것 말고 기존에 있는 class들을 의미합니다.
 */
public class ObjectTest extends Object{
    private String name;
    private String address;

    public ObjectTest() {}

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // NoArgConstructor 정의하세요

    // AllArgsConstructor 정의
    //getter/setter정의
    //displayInfo() 정의
    //실행 예
    //이름: 김용환
    //주소:부산광역시 연제구
    public void displayInfo(){
        System.out.println("이름 :"+getName()+"\n 주소:"+getAddress());
    }
                //showInfo() return형식으로 작성
    public String showInfo(){
        //여기에 어떻게 쓰고 main으로 가자
        return "이름:"+name+"주소:"+address;
    }


    //즉 기본적으로 toString()이라는 메서드는 어떤 특정한 클래스의 인스턴스를 전부 다 String형태로 바꿔주는 것을 의미하며, 이는
    //Object 클래스의 메서드르 Override했음을 확인할 수 있음.
    @Override
    public String toString() {
        return "이름:" + name + "\n 주소:" + address;
    }
}
