package c18_static;

import lombok.Data;

@Data
public class Product {
    public static int autoIncrement = 20240000; // static변수 : 객체마다 고유의 값을 가지는 것이 아니라
                                                //모든 객체가 공유하는 속성
    //객체 마다 가지는 고유한 값
    public int serialNumber;
    public String productName;

    //생성자 정의
    public Product(String productName){
        serialNumber = ++autoIncrement;
        this.productName=productName;
        System.out.println(productName+" 제품이 생산되었습니다.");
    }
}