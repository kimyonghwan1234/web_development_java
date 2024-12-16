package c18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {

//        ProductView productView1=ProductView.getInstance();
        //여태까지는 이상의 방법으로 객체명을 지정해놓고 해당 객체의 메서드들을 실행시키는 방법을 썼다.


        //ProductView.getInstance() 메서드는 대문자 P이고, 싱글톤에서 분석했듯, static메서드이낟.
        //그리고 getInstance()의 리턴값은 instance라는 static 필드이기 때문에
        //ProductView productView1 = ProductView.getInstance()대입을 생략하고
        //곧장 실행을 시켜봤다.
        //하지만 리턴값이 instance라는데에 주목을 해야 한다.
        //그리고 인스턴스 필드를 확인해본 결과 자료형이 ProductView 클래스의 객체임을 확인할 수 있기 때문에
        //인스턴스 메서드를 실행한 결과와 동일한 값이 나오게 된다.

        ProductView.getInstance().showMainView();

        ProductView.getInstance().showOrderView();
    }
}
