package c17_bean;

/*
    Lombok
        자바에서 반복적으로 작성해야 하는 코드(boilerplate code:보일러 플레이트 코드)를
        자동으로 생성해주는 라이브러리

        장점:
            코드의 가독성을 높일 수 있다 -> 주석을 통한 애너테이션을 붙여 코드 생성을 제어 가능
                특히 스크롤링해서 setter가 있는지 없는지, 특정한 필드에 대한 setter/getter의
                유무 등을 고려할 필요가 없이 @파트만 보더라도 대략적인 코드 흐름을 알 수 있음.

        1. @Data
            - @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualAndHashCode
            애너테이션을 포함한 종합 패키지에 해당

        2. @NoArgsConstructor
            -기본 생성자를 생성

        3. @RequiredAllArgsConstructor
            -final 또는 @NonNull로 지정된 필드를 매개변수로 받는 생성자를 생성
            -초기화를 강제하기 위한 수단으로 쓰인다.

        4. @Setter/ @Getter
            -각 필드에 대해 세터 게터 메서드들을 생성
            -클래스 레벨에 사용하면 모든 필드에 대해,필드 레벨에 사용하면 특정 필드에 대해서만
            게터와 세터가 생성됨 -> 우리는 예시로 보여줬을때만 적용
            -단 @Setter 기준으로 final 필드에는 Setter가 생성되지 않습니다.

        5. @EqualAndHashCode
            -equals()와 hashCode() 메서드를 자동으로 생성 -> 둘이 세트로 만들어야 하기 떄문에 묶임

        6. @ToString
            -toString()메서드를 자동으로 생성
            -객체의 필드 값을 문자열로 표현해주는 메서드

 */

import lombok.Data;


@Data

public class UserEntityLombok {
    private String username;
    private String password;
    private String email;
    private String name;


}
