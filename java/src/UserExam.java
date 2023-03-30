public class UserExam {
    public static void main(String[] args) {
        User user = new User("james@daum.net", "james");

//        System.out.println(user.getEmail());
//        System.out.println(user.getName());
        System.out.println(user);

        User user2 = new User("james@naver.net", "홍길동", "1234" );
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getEmail());
        System.out.println(user2);

    }
}
