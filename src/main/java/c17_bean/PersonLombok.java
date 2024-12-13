package c17_bean;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

/*
    12월 21일 스프링 수업 들어갈 떄 다시 할 예정
    project 생성시에 maven / intellij / gradle 중 gradle선택 -> build.gradle파일이 만들어짐
    ->wrap groovy로 만들었어야 했는데 Kotlin으로 만드는 바람에
    ->build.gradle.kit형태로 만들어져서 늦어짐.

    lombok의존성 주입 -> 마찬가지로 의존성 주입에 대한 개념은 spring에서 배움
    chrome에서 mvn검색
    lombok검색 -> 가장 상위 패치 선택
    현재 우리가 한 방식 gradle(kotlin)파트 클릭해서 복사
    build.gradle.kits에서
    dependencies {
        여기에 복붙
         compileOnly("org.projectlombok:lombok:1.18.36")
         annotationProcessor("org.projectlombok:lombok:1.18.36")
    }
    이거하면 우측 상단에 코끼리 + 새로고침 모양이 뜸, 클릭
    롬복 설정이 마무리됨.(가끔 안되는 경우 intellij를 껐다켜야함)
 */
@RequiredArgsConstructor
@AllArgsConstructor
public class PersonLombok {
    private final String name;
    private int age;


    //@애너테이션 사용을 하게 될 경우에 명시적인 생성자를 코드 작성하게 되면
    //충돌이 일어나기 때문에 둘 중 하나만 사용해야함
//    public PersonLombok(String name) {
//        this.name = name;
//    }
//
//    public PersonLombok(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

}
