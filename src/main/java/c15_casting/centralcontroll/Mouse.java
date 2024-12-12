package c15_casting.centralcontroll;

public class Mouse implements Power{
    @Override
    public void off() {
       System.out.println("Mouse의 전원을 켭니다.");
    }

    @Override
    public void on() {
        System.out.println("Mouse의 전원을 끕니다.");
    }

    //클래스 고유의 메서드 생성
    public void leftClick(){
        System.out.println("왼쪽 버튼 클릭");
    }
}
