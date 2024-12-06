package c09_classes;

public class ProductMain {
    public static void main(String[] args) {
        //객체 생성방법
        //클래스명 객체명 = new 클래스명(); ->이제는 new 클래스명()에서 '클래스명()'이 생성자라는 사릴을 우리는 압니다.
        //기본 생성자
        Product product0=new Product();
        //기본 생성자를 사용했다는 말은 객체 생성 시 속성에 아무런 값을 대입하지 않았다는 의미이므로
        //추가적인 코드 작성을 통해 속성에 값을 대입해야만 함.
        //예시를 위한 product0.showInfo
        product0.productNum = 147258;
        product0. productName = "LG제이패드";
        //필드에 값 대입 후 product0.showInfo();
        product0.showInfo();

        //매개변수 생성자
        Product product1=new Product(987654);
        //이상의 코드로 생성과 동시에 productNum의 속성에 값은 대입이 되어있는 상황 -> 확인을 위한 product1.showInfo();
        product1.showInfo();
        product1.productName="GS충전기";

        //매개변수 생성자
        Product product2=new Product("피치패드");
        product2.showInfo();
        product2.productNum=159357;

        //시리얼 넘버 및 제품명 매개변수 생성자 사용
        Product product3=new Product(4862, "블루미플립6");
        product3.showInfo();

    }
}
