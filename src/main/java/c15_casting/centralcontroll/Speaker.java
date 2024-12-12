package c15_casting.centralcontroll;

public class Speaker implements Power{
    @Override
    public void on() {
        System.out.println("스피커의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스피커의 전원을 끕니다.");
    }


    //아직 다운캐스팅 코드 추가 전인 경우 예시
//    public void changeMode(){
//        sout("음색 모드를 바꿧씁니다.");
//    }
}
