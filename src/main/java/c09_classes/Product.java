package c09_classes;
/*
요구사항: 여러가지 생성자를 정의하세요
기본 생성자
매개변수 생성자

showInfo()
실행 예

1.기본 생성자 사용

"해당 제품의 시리얼 넘버는 147258이고,
제품명은 LG제이패드입니다."

2.시리얼 넘버 사용한 객체 생성

해당 제품의 시리얼 넘버는 987654이고,
제품명은 GS충전깅입니다.

3. 제품명을 사용한 객체 생성

해당 제품의 시리얼 넘버는 159357이고,
제품명은 피치패드입니다.

4. 시리얼 넘버 및 제품명을 사용한 객체 생성

해당 제품의 시리얼 넘버는 4862이고,
제품명은 블루미플립6입니다.

ProductMain.java를 생성하고, 객체 생성
 */
public class Product {
    //필드 선언
    int productNum;
    String productName;


    //기본 생성자
    Product(){

    }

    // 매개변수 생성자
    public Product(int productNum) {
        this.productNum = productNum;

    }

    // 매개변수 생성자
    public Product(String productName) {
        this.productName = productName;
    }

    //매개변수 생성자2개
    public Product(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }

    //showInfo() 정의
    void showInfo(){
        System.out.println("해당 제품의 시리얼 넘버는: " + productNum+"이고,");
        System.out.println("해당 제품명은: " + productName + "입니다.");
    }

}
