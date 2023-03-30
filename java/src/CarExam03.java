public class CarExam03 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1);  // println(object x) - Object로 참조할 수 있는 것은 무엇이든 받을 수 있다.
        // 오버라이딩 전: Car@7ef20235
        // 오버라이딩 후: 자동차~!!!!!!!!!!

        // 부모 타입의 변수로 자식 인스턴스를 참조할 수 있다.
        // 조상 타입의 변수로 후손 인스턴스를 참조할 수 있다.

        // Car c1 = new Bus();
        // Car c2 = new Bus(); -> 이층버스는 Car의 자손이다
        // Object o1 = new Car();
        // Object o2 = new Car();
        // Object o3 = new 이층버스();


    }
}
