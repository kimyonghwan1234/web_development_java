package c04_operator;

public class Operator02 {
    public static void main(String[] args) {
        /*
         ----------------논리 연산자 ---------
         true(1), false(0): 컴퓨터가 읽을 수 있는 두 숫자
         boolean: true/ false를 구분하는 자료형

        AND (&&) -> 곱 T X T= T , T X F =F, F X F =F -> 하나라도 F이면 F
        OR  (||) -> 합 T + T= T, T+ F =T , F+ F =F -> 하나라도 T 이면 T
        NOT (!) 값을 반대로 바꿔준다, 혹은 틀릴 경우를 나타냄 -> 추후 수업
         */


        boolean flag1 =true;
        boolean flag2 = false;
//        boolean result1 = flag1 && flag1;
//        System.out.println("T X T =" + result1);
//
//        boolean result2 = flag1 && flag2 ;
//        System.out.println(result2);
//
//        boolean result3 = flag2 && flag2 ;
//        System.out.println(result3);
//
//        System.out.println("----------------");
//        boolean result4 = flag1|| flag1;
//        System.out.println((result4));
//
//        boolean result5 = flag1|| flag2;
//        System.out.println((result5));
//
//
//        boolean result6 = flag2|| flag2;
//        System.out.println((result6));

        System.out.print("안녕하세요.\t 제 이름은"); // \t -> 2칸 혹은 4칸 띄어쓰기. 이스케이프문
        System.out.print("\n안근수입니다.\n"); // \n -> 개행(enter키)

        boolean result7 = flag1 || flag2&& flag1;
        System.out.println("T + F  X T ="+ result7);

        boolean result8 = 10 % 3 != 0;      // '10 % 3의 결과값이 0이 아니면' 이라는 의미
        System.out.println("10 %3 !=0 =>" + result8);

        boolean result9 = 10 % 3 ==0 ; // '10 % 3 의 결과값이 0이라면'
        System.out.println(result9);
        // 48 - 49 라인에서의 처음 언급되는 점은 'a와 b가 같다'를 자바적으로 표기
        // a=b가 아니라, a==b라는 점이다.



    }
}
