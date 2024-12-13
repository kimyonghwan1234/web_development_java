package c17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntityLombok user1 = new UserEntityLombok();
        user1.setUsername("abcdef");
        user1.setPassword("1234");
        user1.setEmail("a@test.com");
        user1.setName("김용환");

        //이하의 코드에서 알 수 있는 것 : @Data 애너테이션 내부에는 toString() 메서드가 구현되어있다.
        System.out.println(user1);

        System.out.println(user1.getUsername());
        System.out.println(user1.getPassword());
        System.out.println(user1.getEmail());
        System.out.println(user1.getName());


        /*
            username에 abcdef
            password 1234
            email에 a@test.com
            name에 김용환을 넣고

            콘솔에 출력
         */


    }
}
